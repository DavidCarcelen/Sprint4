package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.services;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void  deleteFruit(String fruitId);
    Fruit getFruitById(String fruitId);
    List<Fruit> getAllFruits();
}
