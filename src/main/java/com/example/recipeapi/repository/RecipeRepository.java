package com.example.recipeapi.repository;

import com.example.recipeapi.entity.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Integer> {


    Recipe findByName(String name);
}
