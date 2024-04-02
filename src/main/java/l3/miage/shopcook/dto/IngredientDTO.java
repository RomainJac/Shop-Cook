package l3.miage.shopcook.dto;

import l3.miage.shopcook.user.User;

public class IngredientDTO {
    String name;
    int calories;
    float nutriscore;
    User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public float getNutriscore() {
        return nutriscore;
    }

    public void setNutriscore(float nutriscore) {
        this.nutriscore = nutriscore;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
