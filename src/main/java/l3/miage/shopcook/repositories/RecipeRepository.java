package l3.miage.shopcook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.user.User;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    java.util.List<Recipe> findByUser(User user);
}
