package l3.miage.shopcook.ingredients;

public class IngredientDTO {
    String name;
    int calories;
    float nutriscore;
    String user;

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
}
