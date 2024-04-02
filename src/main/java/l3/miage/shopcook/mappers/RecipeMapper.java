package l3.miage.shopcook.mappers;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import l3.miage.shopcook.dto.RecipeDTO;
import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.repositories.UserRepository;

@Component
public class RecipeMapper {
    @Autowired
    UserRepository userRepository;

    public RecipeDTO toDTO(Recipe recipe) {
        RecipeDTO recipeDTO = new RecipeDTO();
        recipeDTO.setName(recipe.getName());
        recipeDTO.setUser(recipe.getUser().getUsername());
        recipeDTO.setDescription(recipe.getDescription());
        recipeDTO.setTimeToMake(recipe.getTimeToMake());
        recipeDTO.setImage(recipe.getImage());
        if (recipe.getIngredients() != null)
            recipeDTO.setIngredients(recipe.getIngredients().stream().collect(Collectors.toList()));
        return recipeDTO;
    }

    public Recipe toEntity(RecipeDTO recipeDTO) {
        Recipe recipe = new Recipe();
        recipe.setName(recipeDTO.getName());
        recipe.setDescription(recipeDTO.getDescription());
        recipe.setUser(this.userRepository.findByUsername(recipeDTO.getUser()));
        recipe.setTimeToMake(recipeDTO.getTimeToMake());
        recipe.setImage(recipeDTO.getImage());
        if (recipeDTO.getIngredients() != null)
            recipe.setIngredients(recipeDTO.getIngredients().stream().collect(Collectors.toList()));
        return recipe;
    }
}
