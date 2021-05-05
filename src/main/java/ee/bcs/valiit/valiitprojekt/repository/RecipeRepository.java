package ee.bcs.valiit.valiitprojekt.repository;


import ee.bcs.valiit.valiitprojekt.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Repository
public class RecipeRepository {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    public List<Display> recipe(List<Integer> a) {
        String sql = "SELECT * FROM (\n" +
                "SELECT d.output, d.recipe_name, r.fkrecipe_id, count(*) matches, (SELECT count(*) FROM recipes r1 WHERE r1.fkrecipe_id = r.fkrecipe_id) total FROM recipes r LEFT JOIN display d on d.recipe_id = r.fkrecipe_id\n" +
                "WHERE fkingredient_id IN (:a) group by d.output, d.recipe_name, r.fkrecipe_id order by count(*) desc\n" +
                "              ) r2 WHERE matches = total;";


        Map<String, Object> paramMap = new HashMap();
        paramMap.put("a", a);
        return jdbcTemplate.query(sql, paramMap, new RecipesRowMapper());
    }

    public String output(int a, int b, int c) {
        String sql = "SELECT output FROM display WHERE recipe_id in(a,b,c)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("a", a);

        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }

    public void ingredientCountUpdate(List<Integer> a) {
        String sql = "UPDATE ingredients SET ingredient_count = ingredient_count +1 WHERE ingredient_id IN (:a)";
        Map<String, Object> paramMap = new HashMap();
        paramMap.put("a", a);
        jdbcTemplate.update(sql, paramMap);
    }

}
