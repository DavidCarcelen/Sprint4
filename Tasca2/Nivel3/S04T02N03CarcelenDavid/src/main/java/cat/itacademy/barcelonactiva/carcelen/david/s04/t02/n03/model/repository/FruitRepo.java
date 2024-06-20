package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.repository;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n03.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FruitRepo extends JpaRepository<Fruit,String> {

}
