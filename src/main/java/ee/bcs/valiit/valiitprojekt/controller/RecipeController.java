package ee.bcs.valiit.valiitprojekt.controller;


import ee.bcs.valiit.valiitprojekt.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @GetMapping("stuff/recipe/{ingA}/{ingB}/{ingC}/{ingD}")
    public String recipe(@PathVariable("ingA") int a,
                         @PathVariable("ingB") int b,
                         @PathVariable("ingC") int c,
                         @PathVariable("ingD") int d) {
        return recipeService+"";
    }


}
