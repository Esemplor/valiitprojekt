package ee.bcs.valiit.valiitprojekt.repository;

import ee.bcs.valiit.valiitprojekt.Display;
import ee.bcs.valiit.valiitprojekt.Recipes;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipesRowMapper implements RowMapper<Display> {

@Override
    public Display mapRow(ResultSet resultSet, int i) throws SQLException {
        Display output = new Display();
        Recipes response = new Recipes();
        output.setOutput(resultSet.getString("output"));
//        response.setFkrecipeId(resultSet.getInt("fkrecipe_id"));
        output.setRecipeName(resultSet.getString("recipe_name"));
//        response.setFkingredientId(resultSet.getInt("fkingredient_id"));
        output.setFkrecipeId(resultSet.getInt("fkrecipe_id"));
//        output.setImgurl(resultSet.getString("imgurl"));
//        output.setRecipeCount(resultSet.getDouble("recipe_count"));
        return output;
    }
}