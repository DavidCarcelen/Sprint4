package cat.itacademy.barcelonactiva.carcelen.david.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    private String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estàs executant un projecte Gradle.";
    }

    @GetMapping({"/hello2", "/hello2/{name}"})
    private String hello2(@PathVariable(required = false) String name) {
        if (name == null) {
            return "Hola, estàs executant un projecte Gradle.";
        }
        return "Hola, " + name + ". Estàs executant un projecte Gradle.";
    }
}
