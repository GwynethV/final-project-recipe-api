package com.example.recipeapi.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Recipe_Table")
public class Recipe {

@Id
@GeneratedValue
    private int Id;
    private String name;
    private String ingredients;
    private String instructions; }