package ee.bcs.valiit.valiitprojekt;

public class Display {

    private String output;
    private Integer fkrecipeId;
    private String recipeName;
    private Double recipeCount;
    private String imgurl;

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }


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
