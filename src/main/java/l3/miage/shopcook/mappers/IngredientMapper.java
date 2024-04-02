package l3.miage.shopcook.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import l3.miage.shopcook.dto.IngredientDTO;
import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.repositories.UserRepository;

@Component
public class IngredientMapper {

    @Autowired
    private UserRepository userRepository;

    public IngredientDTO toDTO(Ingredient ingredient) {
        IngredientDTO ingredientDTO = new l3.miage.shopcook.dto.IngredientDTO();
        ingredientDTO.setName(ingredient.getName());
        ingredientDTO.setCalories(ingredient.getCalories());
        ingredientDTO.setNutriscore(ingredient.getNutriscore());
        ingredientDTO.setUser(ingredient.getUser().getUsername());
        return ingredientDTO;
    }

    public Ingredient toEntity(IngredientDTO ingredientDTO) {
        Ingredient ingredient = new l3.miage.shopcook.ingredients.Ingredient();
        ingredient.setName(ingredientDTO.getName());
        ingredient.setCalories(ingredientDTO.getCalories());
        ingredient.setNutriscore(ingredientDTO.getNutriscore());
        ingredient.setUser(this.userRepository.findByUsername(ingredientDTO.getUser()));

        return ingredient;
    }

}
