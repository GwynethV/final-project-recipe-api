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
    //Get method - 3 Methods
    //Return all Recipes available
    public List<Recipe> getRecipe(){
        return repository.findAll();

    }
    //Return one Recipe based on Id or nothing
    public  Recipe getRecipeById(int Id){
        return repository.findById(Id).orElse(null);


    }
    //Return recipe by Name
    public  Recipe getRecipeByName(String name){
        return repository.findByName(name);
}

    //Delete
    public String deleteRecipe(int id){
        repository.deleteById(id);

        //Return String -
        return "Recipe deleted !!"+ id;
    }

    public Recipe updateRecipe(Recipe recipe) {
        Recipe existingRecipe = repository.findById(recipe.getId()).orElse(null);
        existingRecipe.setName(recipe.getName());
        existingRecipe.setIngredients(recipe.getIngredients());
        existingRecipe.setInstructions(recipe.getInstructions());
        return repository.save(existingRecipe);


    }
}
