package l3.miage.shopcook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
