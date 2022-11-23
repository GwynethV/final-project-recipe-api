package com.example.recipeapi.Domainentity;
import javax.persistence.*;

@Entity

@Table(name = "recipe")

public class Recipe {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;
    /*@Column(name = "name")
    public String name;
    @Column(name = "Ingredients")
    public String ingredients;

    @Column(name = "instructions")
    public String instructions; */

    public Recipe() {

    }

    public Recipe(String name, String ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;


    }

    public long getId() {
        return id;
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;

    }
    @Override
    public String toString() {
        return "Recipe [id=" + id + ", name=" + name + ", `Ingred`=" + ingredients + ", Instrut=" + instructions + "]";
    }
}


