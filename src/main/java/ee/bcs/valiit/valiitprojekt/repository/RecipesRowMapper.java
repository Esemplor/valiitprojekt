package ee.bcs.valiit.valiitprojekt.repository;

import ee.bcs.valiit.valiitprojekt.Display;
import ee.bcs.valiit.valiitprojekt.Recipes;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipesRowMapper implements RowMapper<Recipes> {


    public Recipes mapRow(ResultSet resultSet, int i) throws SQLException {
        Recipes response =new Recipes();
//        response.setOutput(resultSet.getString("output"));
        response.setFkrecipeId(resultSet.getInt("fkrecipe_id"));
        response.setFkingredientId(resultSet.getInt("fkingredient_id"));
//        response.setRecipeId(resultSet.getInt("recipe_id"));
//        response.setRecipeCount(resultSet.getDouble("recipe_count"));
        return response;
    }
}