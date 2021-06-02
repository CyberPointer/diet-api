package com.diet.api.service.springdatajpa;

import com.diet.api.model.Food;
import com.diet.api.repositories.FoodRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class FoodSDJpaService implements com.diet.api.service.FoodService {
    private FoodRepository foodRepository;

    public FoodSDJpaService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Set<Food> findAll() {
        HashSet<Food> foods = new HashSet<>();
        foodRepository.findAll().iterator().forEachRemaining(foods::add);
        return foods;
    }

    @Override
    public Food findById(Long aLong) {
        return foodRepository.findById(aLong).orElseThrow();
    }

    @Override
    public Food save(Food object) {
        return foodRepository.save(object);
    }

    @Override
    public void delete(Food object) {
        foodRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        foodRepository.deleteById(aLong);
    }
}
