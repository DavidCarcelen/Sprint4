package cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.carcelen.david.s04.t02.n01.model.repository.FruitRepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Service
public class FruitServices {
    private FruitRepo fr;
    private FruitRepo fruitInterface = new FruitRepo() {

        @Override
        public void flush() {

        }

        @Override
        public <S extends Fruit> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends Fruit> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<Fruit> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Integer> integers) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Fruit getOne(Integer integer) {
            return null;
        }

        @Override
        public Fruit getById(Integer integer) {
            return null;
        }

        @Override
        public Fruit getReferenceById(Integer integer) {
            return null;
        }

        @Override
        public <S extends Fruit> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Fruit> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends Fruit> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public List<Fruit> findAll() {
            return null;
        }

        @Override
        public List<Fruit> findAllById(Iterable<Integer> integers) {
            return null;
        }

        @Override
        public <S extends Fruit> S save(S entity) {
            return null;
        }

        @Override
        public Optional<Fruit> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Fruit entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Integer> integers) {

        }

        @Override
        public void deleteAll(Iterable<? extends Fruit> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public List<Fruit> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<Fruit> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Fruit> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Fruit> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Fruit> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Fruit> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends Fruit, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };

}

