package ZZKJunit.service;

import ZZKJunit.dominio.Person;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

@Log4j2
public class PersonService {


    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "não pode passar nulo");
        return person.getAge() >= 18;
    }

    public static void main(String[] args) {

        Person person = new Person(18);

        boolean adult = new PersonService().isAdult(person);

        log.info("é um adulto? -> {}", adult);

    }

}
