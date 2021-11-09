package aula010_Builder.dominio;

import lombok.Data;


/**
 * interessante é que é uma classe dentro de outra
 * sendo que a segunda classe é final static
 * */
@Data
public class Person {

    String nome;
    String email;

    public Person(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



    public static final class PersonBuilder {
        String nome;
        String email;

        public PersonBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(nome, email);
        }
    }
}
