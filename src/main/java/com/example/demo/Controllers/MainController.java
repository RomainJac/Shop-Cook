package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path="/")
public class MainController {
    
    @GetMapping
    public ModelAndView main() {
  ModelAndView mv = new ModelAndView();
        mv.setViewName("ingredients.html");

        return mv;    }

}
