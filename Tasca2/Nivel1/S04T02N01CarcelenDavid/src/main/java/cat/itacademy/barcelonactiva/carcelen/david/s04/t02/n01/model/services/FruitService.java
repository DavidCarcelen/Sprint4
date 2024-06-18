package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.repository.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepo fruitRepo;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepo.save(fruit);
    }

    public Fruit updateFruit(int id, Fruit fruit) {
        if (fruitRepo.existsById(id)) {
            fruit.setId(id);
            return fruitRepo.save(fruit);
        }
        return null; // o lanza una excepción
    }

    public void deleteFruit(int id) {
        if (fruitRepo.existsById(id)) {
            fruitRepo.deleteById(id);
        }
    }

    public Optional<Fruit> getFruitById(int id) {
        return fruitRepo.findById(id);
    }

    public List<Fruit> getAllFruits() {
        return fruitRepo.findAll();
    }

}


