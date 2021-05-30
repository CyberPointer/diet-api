package com.diet.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "food")
@Getter
@Setter
public class Food {
    @Id
    Long id;
    @Column(name = "food_name")
    String food_name;
    @Column(name = "food_type")
    String food_type;
    @Column(name = "kcal")
    Integer kcal;
    @Column(name = "whey")
    Double whey;
    @Column(name = "carbs")
    Double carbs;
    @Column(name = "fat")
    Double fat;
}
