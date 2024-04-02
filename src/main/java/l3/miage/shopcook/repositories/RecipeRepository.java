package l3.miage.shopcook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import l3.miage.shopcook.recipes.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
