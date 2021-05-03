package ee.bcs.valiit.valiitprojekt.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RecipeRepository {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public int recipe(int a, int b, int c, int d) {
        String sql = "SELECT fkrecipe_id FROM recipes WHERE fkingredient_id in(a, b, c, d)";
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("a" a);

        return jdbcTemplate.queryForObject(sql, paramMap, Integer.class);
    }

    public String output(int a, int b, int c){
        String sql = "SELECT output FROM display WHERE recipe_id in(a,b,c)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a" a);

        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }

}
