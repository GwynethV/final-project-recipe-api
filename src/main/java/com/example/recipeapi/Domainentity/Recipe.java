package com.example.recipeapi.Domainentity;
import javax.persistence.*;

@Entity
@Table(name = "recipe")

public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "Ingredients")
    private String ingredients;
    private String list;
    private String quantity;
    @Column(name = "instructions")
    private String instructions;

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

    public void setName() {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients() {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions() {
        this.instructions = instructions;

    }
    @Override
    public String toString() {
        return "Recipe [id=" + id + ", name=" + name + ", `Ingred`=" + ingredients + ", Instrut=" + instructions + "]";
    }
}


