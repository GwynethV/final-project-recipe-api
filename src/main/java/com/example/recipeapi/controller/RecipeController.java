package com.example.recipeapi.controller;

import java.util.List;


import com.example.recipeapi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.recipeapi.entity.Recipe;


@RestController

public class RecipeController {

   @Autowired
   RecipeService service;

   @PostMapping("/addrecipe")
   private Recipe addRecipe(@RequestBody Recipe recipe){
        return service.saveRecipe(recipe);

   }
    @PostMapping("/addrecipes")
    private List<Recipe> addRecipes(@RequestBody List<Recipe> recipe){
        return service.saveRecipe(recipe);

    }
    @GetMapping("/allrecipes")
    private List<Recipe> findAllRecipes(){
        return service.getRecipe();

    }
    @GetMapping("/products/{id}")
    private Recipe findRecipeById(@PathVariable int Id){
        return service.getRecipeById(Id);

        }
    @GetMapping("/products/{name}")
    private Recipe findRecipeByName(@PathVariable String name){
        return service.getRecipeByName(name);

    }
    @PutMapping("/update")
    private Recipe updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }
    @DeleteMapping("/delete{id}")
    private String deleteRecipe(int Id) {
        return service.deleteRecipe(Id);
}
}