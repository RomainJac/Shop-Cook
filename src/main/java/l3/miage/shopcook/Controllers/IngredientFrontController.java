package l3.miage.shopcook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Si on était bons avec un moteur de template comme thymeleaf, on aurait pu 
//utiliser notre IngredientController pour afficher une page dynamique, à partir du json.
//Malheureusement, on ne maîtrise que twig, donc les pages de ce controlleur sont statiques.
//De plus, pour pouvoir communiquer avec notre backend, on a dû modifier notre REST controller
//Afin qu'il accepte également les requêtes POST en application/x-www-form-urlencoded. Les deux
//types de requêtes POST sont acceptées par le même endpoint, mais avec des paramètres différents.
@Controller
@RequestMapping(path = "/ingredients")
public class IngredientFrontController {

    @GetMapping("/add")
    public String show() {
        return "addIngredients.html";
    }

    @GetMapping("/")
    public String showOptions() {
        return "ingredientsOptions.html";
    }

}
