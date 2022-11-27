package com.example.recipeapi;

import com.example.recipeapi.controller.RecipeController;
import com.example.recipeapi.entity.Recipe;
import com.example.recipeapi.repository.RecipeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import javax.naming.Name;

public class RecipeControllerTests {
    @Autowired
    RecipeRepository repository;


    @Test
    public void testFindRecipeByName(){
        String name = "Special fried rice";
        Recipe recipe = repository.findByName(name);

       // assertThat(recipe.getName()).isEqualTo(name);

    }

}
