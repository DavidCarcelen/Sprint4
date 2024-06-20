package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services.impl;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.repository.FruitRepo;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services.FruitService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitRepo fruitRepo;

    @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepo.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (!fruitRepo.existsById(fruit.getId())) {
            throw new FruitNotFoundException("No fruit found with id: " + (fruit.getId()));
        }
        return fruitRepo.save(fruit);
    }

    @Override
    public void deleteFruit(int id) {
        if (fruitRepo.existsById(id)) {
            fruitRepo.deleteById(id);
        } else {
            throw new FruitNotFoundException("No fruit found with id: " + id);
        }
    }

    @Override
    public Fruit getFruitById(int id) {
        return fruitRepo.findById(id).orElseThrow(() -> new FruitNotFoundException("No fruit found with id: " + id));
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepo.findAll();
    }

}


