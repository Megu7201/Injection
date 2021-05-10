package test.injection.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import test.injection.Model.Animal;

@Repository
public class MyRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void add(Animal animal){
        jdbcTemplate.update("insert into animals(name) values(?)",animal.getName());
    }

    public List<Animal> get(String query){
        query = "select * from animals where name='" + query + "'";
        System.out.print(query);
        return jdbcTemplate.query(query, new BeanPropertyRowMapper(Animal.class));
        
    } 
}
