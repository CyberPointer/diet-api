package com.diet.api.service.springdatajpa;

import com.diet.api.model.Food;
import com.diet.api.service.FoodService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class FoodSDJpaService implements FoodService {
    @Override
    public Set<Food> findAll() {
        return null;
    }

    @Override
    public Food findById(Long aLong) {
        return null;
    }

    @Override
    public Food save(Food object) {
        return null;
    }

    @Override
    public void delete(Food object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
