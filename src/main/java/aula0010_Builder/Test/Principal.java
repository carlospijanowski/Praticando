package aula0010_Builder.Test;

import aula0010_Builder.dominio.Person;

public class Principal {

    public static void main(String[] args) {

        Person pessoa = new Person.PersonBuilder()
                .nome("Carlos")
                .email("carlospc1978@gmail.com")
                .build();

        System.out.println(pessoa.getNome());

    }

}
