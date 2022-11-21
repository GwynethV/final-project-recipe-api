package com.example.recipeapi.Recipe;

public class Recipe {

        private final Long id;
        private final String name;
        private final String ingredients;
        private final String image;

        public Recipe(
                Long id,
                String name,
                String ingredients,
                String image
                )
        {
            this.id = id;
            this.name = name;
            this.ingredients = ingredients;
            this.image = image;

        }
        public Long getId (){
            return id;
        }
        public String getName (){
            return name;
        }
        public String getIngredients (){
            return ingredients;
        }
        public String getImage (){
        return image;
    }
    public Recipe updateWith(Recipe recipe) {
            return new Recipe(
                    this.id,
                    recipe.name,
                    recipe.ingredients,
                    recipe.image
            );
    }


}
