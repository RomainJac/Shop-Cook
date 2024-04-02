package l3.miage.shopcook.mappers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import l3.miage.shopcook.dto.RecipeDTO;
import l3.miage.shopcook.recipes.Recipe;

@Component
public class RecipeMapper {

    public RecipeDTO toDTO(Recipe recipe) {
        RecipeDTO recipeDTO = new RecipeDTO();
        recipeDTO.setName(recipe.getName());
        recipeDTO.setDescription(recipe.getDescription());
        recipeDTO.setTimeToMake(recipe.getTimeToMake());
        recipeDTO.setImage(recipe.getImage());
        recipeDTO.setIngredients(recipe.getIngredients().stream().collect(Collectors.toList()));
        return recipeDTO;
    }

    public Recipe toEntity(RecipeDTO recipeDTO) {
        Recipe recipe = new Recipe();
        recipe.setName(recipeDTO.getName());
        recipe.setDescription(recipeDTO.getDescription());
        recipe.setTimeToMake(recipeDTO.getTimeToMake());
        recipe.setImage(recipeDTO.getImage());
        recipe.setIngredients(recipeDTO.getIngredients().stream().collect(Collectors.toList()));
        return recipe;
    }
}
