package ZZKJunit.service;

import ZZKJunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    private PersonService personService;
    private Person person;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
        person = new Person(18);
    }

    @Test
    void testIsAdult() {
        boolean result = personService.isAdult(person);
        Assertions.assertEquals(true, result);
    }

}
