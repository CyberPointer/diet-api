package com.diet.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "food")
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "food_name")
    String foodName;
    @Column(name = "food_type")
    String foodType;
    @Column(name = "kcal")
    Integer kcal;
    @Column(name = "whey")
    Double whey;
    @Column(name = "carbs")
    Double carbs;
    @Column(name = "fat")
    Double fat;
}
