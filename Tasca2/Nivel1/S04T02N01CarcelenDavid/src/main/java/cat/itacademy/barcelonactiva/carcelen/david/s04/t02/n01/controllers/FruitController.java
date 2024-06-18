package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services.FruitServices;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController { // mirar response entity
    private FruitServices fs;
    @PostMapping("/fruit/add")
    private String addFruit (){
        //Fruit f = new Fruit("manzana", 20);//tomar datos
        try {

        }catch(Exception e){

        }
        return "You added ";
    }
    @PutMapping("/fruit/update")
    private String updateFruit (Fruit fruit){
        return "You updated " + fruit.getName();
    }
    @DeleteMapping("/fruit/delete/{id}")
    private String deleteFruit (@PathVariable(required = true)Fruit fruit){
        int id = fruit.getId();
        return "You deleted " + fruit.getName();
    }
    @GetMapping("/fruit/getOne/{id}")
    private String getOneFruit (@PathVariable(required = true)Fruit fruit){
        int id = fruit.getId();
        return fruit.toString();
    }
    @GetMapping("/fruit/getAll")
    private String getAllFruit (){

        return "You have it";
    }

}
