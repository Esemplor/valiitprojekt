package ee.bcs.valiit.valiitprojekt.service;


import ee.bcs.valiit.valiitprojekt.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

public String recipe(int a, int b, int c, int d){
    return "Võimalikud retseptid on: "+recipeRepository.recipe(a, b,c,d);
}
public String recipecheck(int a, int b, int c, int d){


    if(a, b, c, .... == recipeRepository.recipe() )
}


}
