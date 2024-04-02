package l3.miage.shopcook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.user.User;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    List<Recipe> findByUser(User user);

    Recipe findByName(String name);

}
