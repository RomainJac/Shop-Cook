package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.stereotype.Service;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.user.User;

@Service
public interface RecipeService {
    boolean save(Recipe recipe);
    boolean delete(Recipe recipe);
    boolean update(Recipe recipe);
    Recipe findById(int id);
    List<Recipe> findAll(); 
    List<Recipe> findByUser(User user);
}
