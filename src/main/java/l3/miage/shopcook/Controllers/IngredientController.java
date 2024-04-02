package l3.miage.shopcook.Controllers;

import java.io.IOException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.ingredients.IngredientDTO;
import l3.miage.shopcook.services.IngredientService;

@RestController
@RequestMapping(path = "/ingredients") // This means URL's start with /demo (after Application path)
public class IngredientController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private IngredientService ingredientService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE) // Map ONLY POST Requests
    public ResponseEntity<String> addNewIngredient(IngredientDTO ingredientDTO) throws IOException {
        Ingredient ingredient = this.modelMapper.map(ingredientDTO, Ingredient.class);
        ingredientService.save(ingredient);
        return ResponseEntity.ok("Saved");
    }

    @PostMapping(path = "/add", consumes = { "application/json" })
    public Ingredient add(@RequestBody IngredientDTO ingredientDTO) throws IOException {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Ingredient ingredient = this.modelMapper.map(ingredientDTO, Ingredient.class);
        ingredientService.save(ingredient);
        return ingredient;
    }

    @GetMapping(path = "/all")
    public List<Ingredient> getAllIngredients() {
        // This returns a JSON or XML with the users
        return ingredientService.findAll();
    }

}
