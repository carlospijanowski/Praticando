package aula0010_Builder.Test;

import aula0010_Builder.dominio.Person;
import aula0010_Builder.dto.Pessoa;

public class Principal {

    public static void main(String[] args) {

        Person pessoa = new Person.PersonBuilder()
                .nome("Carlos")
                .email("carlospc1978@gmail.com")
                .build();

        System.out.println(pessoa.getNome());


        Pessoa pessoa1 = new Pessoa();
        pessoa1.builder().nome("Edgle").endereco("Rua Pau Brasil").build();
        System.out.println(pessoa1.toString());

    }

}
