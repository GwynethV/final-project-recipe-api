package com.example.recipeapi.controller;



import java.util.List;


import com.example.recipeapi.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.example.recipeapi.entity.Recipe;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class RecipeController {

   @Autowired
   private RecipeService service;

   @PostMapping("/addrecipe")
   public Recipe addRecipe(@RequestBody Recipe recipe){
        return service.saveRecipe(recipe);

   }
    @PostMapping("/addrecipes")
    public List<Recipe> addRecipes(@RequestBody List<Recipe> recipe){
        return service.saveRecipe(recipe);

    }
    @GetMapping("/products")
    public List<Recipe> findAllRecipes(){
        return service.getRecipe();

    }
    @GetMapping("/products/{id}")
    public Recipe findRecipeById(@PathVariable int Id){
        return service.getRecipeById(Id);

        }
    @GetMapping("/products/{name}")
    public Recipe findRecipeByName(@PathVariable String name){
        return service.getRecipeByName(name);

    }
    @PutMapping("/update")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return service.updateRecipe(recipe);
    }
    @DeleteMapping("/delete{id}")
    public String deleteRecipe(int Id) {
        return service.deleteRecipe(Id);
}
}