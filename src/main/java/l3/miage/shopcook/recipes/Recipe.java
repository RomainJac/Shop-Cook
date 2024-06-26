package l3.miage.shopcook.recipes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.user.User;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ElementCollection
    @ManyToMany(mappedBy = "name")
    @JsonBackReference
    private List<Ingredient> ingredients;
    @ManyToOne(targetEntity = User.class, optional = true)
    @JsonBackReference
    User user;
    private String image;
    private String name;
    private String description;

    @Column(name = "time_to_make")
    private String timeToMake;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public int getId() {
        return this.id;
    }

}
