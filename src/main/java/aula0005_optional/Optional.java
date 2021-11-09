package aula0005_optional;

import model.Clientes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Optional {


    public static void main(String[] args) {
        List<String>lista = Arrays.asList("Ana","Bia","Carlos","Salomao");

        Clientes cliente1 = new Clientes("Ana",true);
        Clientes cliente2 = new Clientes("Bia",true);
        Clientes cliente3 = new Clientes("Carlos",true);

        List<Clientes>listaDosClientes = Arrays.asList(cliente1,cliente2,cliente3);

        procurarPeloPrimeiro(lista);
        filtrarPeloCarlos(listaDosClientes);

        listaDosClientes.stream().findFirst().ifPresent(n -> {
            System.out.println("primeiro presente -> "+n.getNomeDoCliente());
        });

    }

    public static void procurarPeloPrimeiro(List<String> a){
        a.stream().findFirst().ifPresent(System.out::println);
    }

    static void filtrarPeloCarlos(List<Clientes>listaDosClientes){

        List<Clientes> carlos = listaDosClientes.stream().filter((clientes -> clientes.getNomeDoCliente().equals("Carlos"))).collect(Collectors.toList());
        System.out.println(carlos);

    }



}
