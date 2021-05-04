package ee.bcs.valiit.valiitprojekt;

public class Display {

    private Integer fkrecipeId;
    private String recipeName;
    private Double recipeCount;

    public Integer getFkrecipeId() {
        return fkrecipeId;
    }

    public void setFkrecipeId(Integer fkrecipeId) {
        this.fkrecipeId = fkrecipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Double getRecipeCount() {
        return recipeCount;
    }

    public void setRecipeCount(Double recipeCount) {
        this.recipeCount = recipeCount;
    }
}
