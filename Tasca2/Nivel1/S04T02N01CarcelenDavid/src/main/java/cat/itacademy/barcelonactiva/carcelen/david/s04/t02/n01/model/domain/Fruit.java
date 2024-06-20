package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int kilos;

   public Fruit(String name, int kilos) {
        this.name = name;
        this.kilos = kilos;
    }

}
