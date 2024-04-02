package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.stereotype.Service;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.user.User;

@Service
public interface RecipeService {
    Recipe save(Recipe recipe);

    Recipe delete(Recipe recipe);

    Recipe update(Recipe recipe);

    Recipe findById(int id);

    List<Recipe> findAll();

    List<Recipe> findByUser(User user);

    Recipe deleteById(Integer id);

    Recipe findByName(String name);

}
