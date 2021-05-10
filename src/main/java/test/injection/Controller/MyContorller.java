package test.injection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import test.injection.Controller.Service.MyService;
import test.injection.Model.Animal;

@RestController
public class MyContorller{

    @Autowired
    MyService service;

    @GetMapping("/")
    public String index(){
        Animal a = new Animal();
        a.setId(0);
        a.setName("andy");
        service.add(a);
        return "new";
    }

    @GetMapping("/all/{query}")
    public List<Animal> getAll(@PathVariable String query){
        return service.get(query);
    }


}