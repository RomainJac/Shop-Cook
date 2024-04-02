package l3.miage.shopcook.mappers;

import org.springframework.stereotype.Component;
import l3.miage.shopcook.dto.IngredientDTO;
import l3.miage.shopcook.ingredients.Ingredient;

@Component
public class IngredientMapper {

    public static l3.miage.shopcook.dto.IngredientDTO toDTO(Ingredient ingredient) {
        IngredientDTO ingredientDTO = new l3.miage.shopcook.dto.IngredientDTO();
        ingredientDTO.setName(ingredient.getName());
        ingredientDTO.setCalories(ingredient.getCalories());
        ingredientDTO.setNutriscore(ingredient.getNutriscore());
        ingredientDTO.setUser(ingredient.getUser());
        return ingredientDTO;
    }

    public static l3.miage.shopcook.ingredients.Ingredient toEntity(IngredientDTO ingredientDTO) {
        Ingredient ingredient = new l3.miage.shopcook.ingredients.Ingredient();
        ingredient.setName(ingredientDTO.getName());
        ingredient.setCalories(ingredientDTO.getCalories());
        ingredient.setNutriscore(ingredientDTO.getNutriscore());
        ingredient.setUser(ingredientDTO.getUser());

        return ingredient;
    }

}
