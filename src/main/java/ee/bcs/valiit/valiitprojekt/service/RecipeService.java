package ee.bcs.valiit.valiitprojekt.service;


import ee.bcs.valiit.valiitprojekt.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

public String recipe(List<Integer> a){
    return "Võimalikud retseptid on: "+recipeRepository.recipe(a);
}


}
