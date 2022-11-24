package com.example.recipeapi.entity;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;


@Entity
public class Recipe {

    @Id
    @GeneratedValue()
    private int Id;


    private String name;


    private String ingredients;

    private String instructions;
public Recipe (){

}

    public Recipe(Long Id,String name, String ingredients, String instructions) {
        super ();
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
}

    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getName() {
      return name;
    }
    public void setName(String Name) {
        this.name = name;
    }
    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    public String getInstructions(){
        return instructions;
    }
    public void setInstructions(String instructions) {
        this.ingredients = instructions;
    }

}