package com.diet.api.service.springdatajpa;

import com.diet.api.model.Food;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class FoodSDJpaServiceTest {

   private FoodSDJpaService foodSDJpaService;
   private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp(){
     autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
    autoCloseable.close();
    }

    @Test
    @Disabled
    void save() {
        //given
        //when
        //then

        Food rice = new Food();
        rice.setFood_name("Rice");
        rice.setFood_type("Cereal");
        Food chicken = new Food();
        rice.setFood_name("Chicken");
        rice.setFood_type("Meat");

        //foodSDJpaService.save();
    }

    @Test
    @Disabled
    void findAll() {
        //given
        //when
        //then

    }

    @Test
    @Disabled
    void findById() {
        //given
        //when
        //then
    }



    @Test
    @Disabled
    void delete() {
        //given
        //when
        //then
    }

    @Test
    @Disabled
    void deleteById() {
        //given
        //when
        //then
    }
}