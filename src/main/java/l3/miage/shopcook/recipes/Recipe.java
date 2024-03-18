package l3.miage.shopcook.recipes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationPlan;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import l3.miage.shopcook.ingredients.Ingredient;

@Entity
@Table(name="recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ElementCollection
    @ManyToMany
    private List<Ingredient> ingredients;
    private String image;
    private String name;
    private String description;
    private String timeToMake;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
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

    public Recipe() {
        this.ingredients=new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }
    
}
