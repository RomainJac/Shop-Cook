package l3.miage.shopcook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView addRecipe(@RequestBody Recipe recipe) {
        this.recipeRepository.save(recipe);
        return new RedirectView("/options");
    }
    @GetMapping(path = "/{id}")
    public Recipe findById(@PathVariable("id")int id) {
        return this.recipeRepository.findById( id).get();
    }
    
}
