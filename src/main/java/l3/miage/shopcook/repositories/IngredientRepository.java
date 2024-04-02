package l3.miage.shopcook.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import l3.miage.shopcook.ingredients.Ingredient;
import l3.miage.shopcook.user.User;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    boolean existsByName(String name);
    List<Ingredient> findByUser(User user);
    Ingredient findByName(String name);
    void deleteById(Integer id);
}
