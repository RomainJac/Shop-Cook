package l3.miage.shopcook.dto;

import java.util.List;

import l3.miage.shopcook.ingredients.Ingredient;

public class RecipeDTO {
    private String name;
    private String description;
    private String timeToMake;
    private String image;
    private List<Ingredient> ingredients;
    private String user;

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(String timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}
