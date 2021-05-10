package test.injection.Controller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.injection.Model.Animal;
import test.injection.Repo.MyRepo;

@Service
public class MyService {
    @Autowired
    private MyRepo repo;

    public void add(Animal animal){
        repo.add(animal);
    }

    public List<Animal> get(String query){
        return repo.get(query);
    }

}
