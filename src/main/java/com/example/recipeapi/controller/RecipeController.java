package com.example.recipeapi.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.recipeapi.repository.RecipeRepository;
import com.example.recipeapi.entity.Recipe;
/*
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;
    @GetMapping("/recipe")
    public ResponseEntity<List<Recipe>> getAllRecipes(@RequestParam(required = false)String name) {
        try {
            List<Recipe> recipes = new ArrayList<Recipe>();

            if (name == null)
                RecipeRepository.findAllRecipes().forEach(recipes::add);
            else
                RecipeRepository.findByNameContaining(name).forEach(recipes::add);

            if (recipes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            }
            return new ResponseEntity<>(recipes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/recipes/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable("id") int id) {
        Optional<Recipe> RecipeData = recipeRepository.findById(Id);

        if (Recipe.Data()).isPresent()) {
            return new ResponseEntity<>(recipeData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/recipe")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        try {
            Recipe _recipe = recipeRepository
                    .save(new Recipe(recipe.getName(), Recipe.getIngredients(), false));
            return new ResponseEntity<>(_recipe, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/recipe/{id}")
    public ResponseEntity<Recipe> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
        Optional<Recipe> recipeData = RecipeRepository.findById(id);

        if (RecipeData.isPresent()) {
            Recipe _recipe = RecipeData.get();
            _recipe.setName(tutorial.getName());
            _recipe.setIngredients(tutorial.getIngredients());
            _recipe.setInstructions(tutorial.getInstructions());
            return new ResponseEntity<>(RecipeRepository.save(_recipe), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } }
    @DeleteMapping("/recipe/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            RecipeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
}
