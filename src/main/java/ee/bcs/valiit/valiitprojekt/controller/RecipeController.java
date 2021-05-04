package ee.bcs.valiit.valiitprojekt.controller;


import ee.bcs.valiit.valiitprojekt.Display;
import ee.bcs.valiit.valiitprojekt.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;


    // localhost:8080/stuff/recipe?a=1,5,6
    @GetMapping("stuff/recipe")
    public List<Display> recipe(@RequestParam("a") List<Integer> a) {
        return recipeService.recipe(a);
    }


}
