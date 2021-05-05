package ee.bcs.valiit.valiitprojekt.controller;


import ee.bcs.valiit.valiitprojekt.Display;
import ee.bcs.valiit.valiitprojekt.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;


    // localhost:8080/stuff/recipe?a=1,5,6
    @CrossOrigin
    @GetMapping("stuff/recipe")
    public List<Display> recipe(@RequestParam("a") List<Integer> a) {
        return recipeService.recipe(a);
    }


}
