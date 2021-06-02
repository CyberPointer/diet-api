package com.diet.api.repositories;

import com.diet.api.model.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class FoodRepositoryTest {
    @Autowired
    private FoodRepository foodRepository;

    @Test
    void save() {
        //given
        Food rice = new Food();
        rice.setFoodName("rice");
        rice.setId(1l);

        //when
        foodRepository.save(rice);

        //then
        assertEquals(1l, foodRepository.count());

    }

    @Test
    void saveAll() {
        //given
        Food rice = new Food();
        rice.setFoodName("rice");
        Food chicken = new Food();
        rice.setFoodName("chicken");
        List<Food> foods = new LinkedList<>();
        foods.add(rice);
        foods.add(chicken);

        //when
        foodRepository.saveAll(foods);

        //then
        assertEquals(2, foodRepository.count());
    }

    @Test
    void findById() {
        //given
        Food rice = new Food();
        rice.setFoodName("rice");

        //when
        foodRepository.save(rice);

        //then
        assertNotNull(foodRepository.findById(1l).get());
    }


}