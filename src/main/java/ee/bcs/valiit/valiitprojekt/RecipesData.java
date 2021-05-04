package ee.bcs.valiit.valiitprojekt;

public class RecipesData {

    private int fkrecipe_id;
    private  int fkingredient_id;
    private String recipe_name;

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public int getFkrecipe_id() {
        return fkrecipe_id;
    }

    public void setFkrecipe_id(int fkrecipe_id) {
        this.fkrecipe_id = fkrecipe_id;
    }

    public int getFkingredient_id() {
        return fkingredient_id;
    }

    public void setFkingredient_id(int fkingredient_id) {
        this.fkingredient_id = fkingredient_id;
    }
}
