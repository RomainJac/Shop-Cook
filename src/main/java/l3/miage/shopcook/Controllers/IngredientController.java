package l3.miage.shopcook.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l3.miage.shopcook.dto.IngredientDTO;
import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.services.IngredientService;
import l3.miage.shopcook.mappers.IngredientMapper;

@RestController
@RequestMapping(path = "/ingredients")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> addNewIngredient(IngredientDTO ingredientDTO) throws IOException {
        Ingredient ingredient = IngredientMapper.toEntity(ingredientDTO); 
        ingredientService.save(ingredient);
        return ResponseEntity.ok("Saved");
    }

    @PostMapping(path = "/add", consumes = { "application/json" })
    public Ingredient add(@RequestBody IngredientDTO ingredientDTO) throws IOException {
        Ingredient ingredient = IngredientMapper.toEntity(ingredientDTO); 
        ingredientService.save(ingredient);
        return ingredient;
    }

    @GetMapping(path = "/all")
    public List<Ingredient> getAllIngredients() {
        return ingredientService.findAll();
    }
}
