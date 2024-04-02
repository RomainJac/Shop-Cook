package l3.miage.shopcook.ingredients;

import java.io.Serializable;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    // @ElementCollection
    // @OneToMany
    // private List<DietaryRestriction> dietaryRestrictions;
    @Nullable
    private float nutriscore;
    @Nullable
    private int calories;

    // public Ingredient(String name, List<DietaryRestriction> dietaryRestrictions,
    // float nutriscore, int calories) {
    // this.name = name;
    // this.dietaryRestrictions = dietaryRestrictions;
    // this.nutriscore = nutriscore;
    // this.calories = calories;
    // }
    public Ingredient() {
        this.name = "";
    }

    public Ingredient(String name, float nutriscore, int calories) {
        this.name = name;
        this.nutriscore = nutriscore;
        this.calories = calories;
    }

    public Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getNutriscore() {
        return nutriscore;
    }

    public int getCalories() {
        return calories;
    }

    // public List<DietaryRestriction> getDietaryRestrictions() {
    // return dietaryRestrictions;
    // }
    // public void addDietaryRestriction(DietaryRestriction dietaryRestriction) {
    // this.dietaryRestrictions.add(dietaryRestriction);
    // }
    // public void setDietaryRestrictions(List<DietaryRestriction>
    // dietaryRestrictions) {
    // this.dietaryRestrictions = dietaryRestrictions;
    // }
    public void setName(String name) {
        this.name = name;
    }

    public void setNutriscore(float nutriscore) {
        this.nutriscore = nutriscore;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
