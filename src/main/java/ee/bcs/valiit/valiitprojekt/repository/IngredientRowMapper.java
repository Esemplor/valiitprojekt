package ee.bcs.valiit.valiitprojekt.repository;


import ee.bcs.valiit.valiitprojekt.Ingredients;

import liquibase.pro.packaged.I;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IngredientRowMapper implements RowMapper<Ingredients> {

    @Override
    public Ingredients mapRow(ResultSet resultSet, int i) throws SQLException{
        Ingredients ingredients = new Ingredients();
        ingredients.setIngredientName(resultSet.getString("ingredient_name"));
//        ingredients.setIngredientId(resultSet.getInt("ingredient_id"));
//        ingredients.setIngredientCount(resultSet.getDouble("ingredient_count"));
        return ingredients;
    }

}
