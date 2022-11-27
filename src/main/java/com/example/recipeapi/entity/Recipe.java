package com.example.recipeapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;

//Class as an Entity
@Entity
//Defining class as a Table name
@Table
public class Recipe {

    @Id
    @Column
    @GeneratedValue()
    private int Id;

    @Column
    private String name;


    @Column
    private String ingredients;


    @Column
    private String instructions;
public Recipe (){

}

    public Recipe(int Id,String name, String ingredients, String instructions) {
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
    public void setName(String name) {
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