package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.controllers;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.services.impl.FruitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {

    @Autowired
    private FruitServiceImpl fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        Fruit savedFruit = fruitService.addFruit(fruit);
        return ResponseEntity.ok(savedFruit);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
            Fruit updatedFruit = fruitService.updateFruit(fruit);
            return ResponseEntity.ok(updatedFruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable String id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.ok("Fruit deleted");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruitById(@PathVariable String id) {
        Fruit fruit = fruitService.getFruitById(id);
        return ResponseEntity.ok().body(fruit);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return ResponseEntity.ok(fruits);
    }

}
