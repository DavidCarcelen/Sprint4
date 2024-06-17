package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.Fruit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
    @GetMapping("/fruit/add")
    private String addFruit (Fruit fruit){
        return "You added " + fruit.getName();
    }
    @GetMapping("/fruit/update")
    private String updateFruit (Fruit fruit){
        return "You updated " + fruit.getName();
    }
    @GetMapping("/fruit/delete/{id}")
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



    //La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:
    //
    //http://localhost:8080/fruita/add
    //
    //http://localhost:8080/fruita/update
    //
    //http://localhost:8080/fruita/delete/{id}
    //
    //http://localhost:8080/fruita/getOne/{id}
    //
    //http://localhost:8080/fruita/getAll
}
