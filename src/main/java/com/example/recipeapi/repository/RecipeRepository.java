package com.example.recipeapi.repository;

import java.util.List;
import com.example.recipeapi.Domainentity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByIngredients(String ingredients);

    List<Recipe> findByNameContaining(String name);
}
