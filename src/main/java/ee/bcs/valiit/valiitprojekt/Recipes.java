package ee.bcs.valiit.valiitprojekt;


public class Recipes {

    private Integer fkrecipeId;
    private String recipeName;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Integer getFkrecipeId() {
        return fkrecipeId;
    }

    public void setFkrecipeId(Integer fkrecipeId) {
        this.fkrecipeId = fkrecipeId;
    }

//    public Integer getFkingredientId() {
//        return fkingredientId;
//    }
//
//    public void setFkingredientId(Integer fkingredientId) {
//        this.fkingredientId = fkingredientId;
//    }
}
