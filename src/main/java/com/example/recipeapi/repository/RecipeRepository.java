package com.example.recipeapi.repository;

import java.util.List;
import com.example.recipeapi.Domainentity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, String> {
    List<Recipe> findById(int Id);

    List<Recipe> findByNameContaining(String name);

}
