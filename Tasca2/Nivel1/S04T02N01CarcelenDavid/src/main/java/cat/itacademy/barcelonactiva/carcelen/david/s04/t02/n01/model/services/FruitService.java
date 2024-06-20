package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;

import java.util.List;
import java.util.Optional;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(int fruitId);
    Fruit getFruitById(int fruitId);
    List<Fruit> getAllFruits();
}
