package ee.bcs.valiit.valiitprojekt.repository;


import ee.bcs.valiit.valiitprojekt.Display;
import ee.bcs.valiit.valiitprojekt.Recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RecipeRepository {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public List<Display> recipe(List<Integer> a) {
        String sql = "SELECT d.recipe_name, r.fkrecipe_id, d.output, count(*) FROM recipes r\n" +
                "LEFT JOIN display d on d.recipe_id = r.fkrecipe_id\n" +
                "WHERE fkingredient_id IN (:a) group by d.output, d.recipe_name, r.fkrecipe_id order by count(*) desc";
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("a", a);
        return jdbcTemplate.query(sql, paramMap, new RecipesRowMapper());
    }

    public String output(int a, int b, int c){
        String sql = "SELECT output FROM display WHERE recipe_id in(a,b,c)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", a);

        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }

}
