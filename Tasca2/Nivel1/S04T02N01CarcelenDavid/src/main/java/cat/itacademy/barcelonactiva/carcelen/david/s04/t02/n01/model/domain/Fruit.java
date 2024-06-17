package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain;

import jakarta.persistence.Entity;

@Entity
public class Fruit {
    private int id;
    private String name;
    private int kilos;

    public Fruit(int id, String name, int kilos) {
        this.id = id;
        this.name = name;
        this.kilos = kilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kilos=" + kilos +
                '}';
    }
}
