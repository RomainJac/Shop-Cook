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
import l3.miage.shopcook.services.RecipeService;
import l3.miage.shopcook.dto.RecipeDTO;
import l3.miage.shopcook.mappers.RecipeMapper;

@RestController
@RequestMapping(path = "/recipes")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @Autowired
    private RecipeMapper recipeMapper;

    @GetMapping(path = "/all")
    public List<Recipe> findAll() {
        return this.recipeService.findAll();
    }

    @PostMapping(path = "/add")
    public RedirectView addRecipe(@RequestBody RecipeDTO recipeDTO) {
        Recipe recipe = recipeMapper.toEntity(recipeDTO);
        this.recipeService.save(recipe);
        return new RedirectView("/options");
    }

    @GetMapping(path = "/{id}")
    public Recipe findById(@PathVariable("id") int id) {
        return this.recipeService.findById(id);
    }
}
