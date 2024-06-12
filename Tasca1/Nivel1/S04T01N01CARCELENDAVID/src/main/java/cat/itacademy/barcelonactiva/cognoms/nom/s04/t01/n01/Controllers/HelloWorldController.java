package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    private String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estàs executant un projecte Maven.";
    }

    @GetMapping({"/hello2", "/hello2/{name}"})
    private String hello2(@PathVariable(required = false) String name) {
        if (name == null) {
            return "Hola, estàs executant un projecte Maven.";
        }
        return "Hola, " + name + ". Estàs executant un projecte Maven.";
    }
}
