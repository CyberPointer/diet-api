package com.diet.api.service.springdatajpa;

import com.diet.api.model.Food;
import com.diet.api.repositories.FoodRepository;
import com.diet.api.service.FoodService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


class FoodSDJpaServiceTest {
    @Mock
    FoodRepository foodRepository;
    @Autowired
    FoodService foodService;
    AutoCloseable autoCloseable;
    Food rice;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        foodService = new FoodSDJpaService(foodRepository);
        rice = new Food();
        rice.setFoodName("rice");

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void findAll() {
        //given
        Food chicken = new Food();
        rice.setFoodName("chicken");
        Set<Food> foods = new HashSet<>();
        foods.add(rice);
        foods.add(chicken);

        //when
        when(foodRepository.findAll()).thenReturn(foods);

        //then
        assertEquals(foodService.findAll(), foods);
        verify(foodRepository).findAll();
    }

    @Test
    void findById() {
        //given
        //when
        when(foodRepository.findById(anyLong())).thenReturn(java.util.Optional.of(rice));
        //then
        assertEquals(foodService.findById(1l), rice);
        verify(foodRepository).findById(anyLong());

    }

    @Test
    @Disabled
    void findByIdNotFound() {
        //given
        //when
        when(foodRepository.findById(anyLong())).thenReturn(java.util.Optional.of(rice));
        //then
        assertEquals(foodService.findById(1l), rice);
        verify(foodRepository).findById(anyLong());

    }

    @Test
    void save() {
        //given
        Food apple = new Food();
        apple.setFoodName("apple");

        //when
        foodService.save(apple);

        //then
        ArgumentCaptor<Food> argumentCaptor = ArgumentCaptor.forClass(Food.class);
        verify(foodRepository).save(argumentCaptor.capture());
        Food capturedFood = argumentCaptor.getValue();
        assertEquals(capturedFood, apple);
    }

    @Test
    void deleteByObject() {
        //given
        Food orange = new Food();
        orange.setFoodName("orange");
        //when
        foodService.delete(orange);
        //then
        verify(foodRepository).delete(any(Food.class));
    }

    @Test
    void deleteById() {
        //given
        Long idToDelete = 2l;
        //when
        foodService.deleteById(idToDelete);
        //then
        verify(foodRepository).deleteById(anyLong());
    }
}