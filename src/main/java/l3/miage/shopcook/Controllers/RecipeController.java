package l3.miage.shopcook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.repositories.RecipeRepository;

@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;
    @GetMapping(path = "/all")
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }
    @PostMapping (path = "/add")
    public void addRecipe(Recipe recipe) {
        this.recipeRepository.save(recipe);
    }
    @GetMapping(path = "/{id}")
    public Recipe findById(@PathVariable("id")int id) {
        return this.recipeRepository.findById( id).get();
    }
    
}
