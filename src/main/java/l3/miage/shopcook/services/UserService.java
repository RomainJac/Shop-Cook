package l3.miage.shopcook.services;

import java.util.List;

import l3.miage.shopcook.recipes.Recipe;
import l3.miage.shopcook.user.User;

public interface UserService {
    boolean save(User user);
    boolean delete(User user);
    boolean update(User user);
    Recipe findById(int id);
    List<Recipe> findAll(); 
}
