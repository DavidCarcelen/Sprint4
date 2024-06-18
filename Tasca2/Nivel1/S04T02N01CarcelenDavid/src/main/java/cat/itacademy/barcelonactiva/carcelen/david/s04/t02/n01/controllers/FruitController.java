package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services.FruitService;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        Fruit savedFruit = fruitService.addFruit(fruit);
        return ResponseEntity.ok(savedFruit);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable int id, @RequestBody Fruit fruit) {
        Fruit updatedFruit = fruitService.updateFruit(id, fruit);
        if (updatedFruit != null) {
            return ResponseEntity.ok(updatedFruit);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Optional<Fruit>> getFruitById(@PathVariable int id) {
        Optional<Fruit> fruit = fruitService.getFruitById(id);
        if (fruit.isPresent()) {
            return ResponseEntity.ok(fruit);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return ResponseEntity.ok(fruits);
    }

}
