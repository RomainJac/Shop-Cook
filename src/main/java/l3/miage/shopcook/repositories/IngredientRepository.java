package l3.miage.shopcook.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import l3.miage.shopcook.ingredients.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer>{
    
}
