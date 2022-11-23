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
import com.example.recipeapi.Domainentity.Recipe;

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
                RecipeRepository.findAll().forEach(recipes::add);
            else
                RecipeRepository.findByNameContaining(name).forEach(recipes::add);

            if (recipes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            }
            return new ResponseEntity<>(recipes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }}
