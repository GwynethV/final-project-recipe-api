package com.example.recipeapi.service;

import com.example.recipeapi.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.recipeapi.entity.Recipe;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository repository;

    //Post method-Save
    public Recipe saveRecipe(Recipe recipe) {
        return repository.save(recipe);
    }
    public List<Recipe> saveRecipe(List<Recipe> recipe){
        return repository.saveAll(recipe);

    }
    //Post method
    public List<Recipe> getRecipe(){
        return repository.findAll();

    }
    public  Recipe getRecipeById(int Id){
        return repository.findById(Id).orElse(null);2

    }}
