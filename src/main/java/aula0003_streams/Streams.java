package aula0003_streams;

import model.Clientes;

import java.util.List;

import static java.util.Arrays.asList;

public class Streams {

    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ooi");
            }
        });

        filtrar_SeOClienteNaoForAtivo();
        System.out.println("****************************************************************");
        mapearClientes();
    }


    public static void filtrar_SeOClienteNaoForAtivo(){
        Clientes cliente1 = new Clientes("Carlos", true);
        Clientes cliente2 = new Clientes("Laura", true);
        Clientes cliente3 = new Clientes("Tatiana", true);
        Clientes cliente4 = new Clientes("Julia", false);

        List<Clientes>listaDeClientes = asList(cliente1,cliente2,cliente3,cliente4);

        listaDeClientes.stream().filter(clientes -> !clientes.isAtivo()).forEach((clientes -> System.out.println(clientes.getNomeDoCliente())));

    }

    public static void mapearClientes(){
        Clientes cliente1 = new Clientes("Carlos", true);
        Clientes cliente2 = new Clientes("Laura", true);
        Clientes cliente3 = new Clientes("Tatiana", true);
        Clientes cliente4 = new Clientes("Julia", false);

        List<Clientes>listaDeClientes = asList(cliente1,cliente2,cliente3,cliente4);

        listaDeClientes.stream().map(Clientes::getNomeDoCliente).forEach(System.out::println);
    }

}
