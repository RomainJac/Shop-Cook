package l3.miage.shopcook.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import l3.miage.shopcook.dto.UserDTO;
import l3.miage.shopcook.user.User;
import l3.miage.shopcook.repositories.IngredientRepository;
import l3.miage.shopcook.repositories.RecipeRepository;
import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.recipes.Recipe;

import java.util.stream.Collectors;

@Component
public class UserMapper {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    public UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        if (user.getIngredients() != null)
             userDTO.setIngredients(user.getIngredients().stream().map(Ingredient::getName).collect(Collectors.toList()));
        if (user.getRecipes() != null)
             userDTO.setRecipes(user.getRecipes().stream().map(Recipe::getName).collect(Collectors.toList()));
        return userDTO;
    }

    public User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        if (userDTO.getIngredients()!=null)
            user.setIngredients(userDTO.getIngredients().stream().map(n -> ingredientRepository.findByName(n))
                .collect(Collectors.toList()));
        if (userDTO.getRecipes()!=null) 
                user.setRecipes(userDTO.getRecipes().stream().map(n -> recipeRepository.findByName(n))
                .collect(Collectors.toList()));
        return user;
    }
}
