package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n02.model.services;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n02.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(int fruitId);
    Fruit getFruitById(int fruitId);
    List<Fruit> getAllFruits();
}
