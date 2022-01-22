package aula_0012_Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {


    public static void main(String[] args) {

        List<Integer> listaDeNumeros;
        listaDeNumeros = new ArrayList<>();

        listaDeNumeros.add(1);
        listaDeNumeros.add(2);
        listaDeNumeros.add(3);
        listaDeNumeros.add(4);

        System.out.printf("listaDeNumeros -> " + listaDeNumeros.get(2));

        for (int a = 0; a < 100; a++) {
            listaDeNumeros.add(a);
        }


        print(listaDeNumeros);

    }

    private static void print(List<Integer> listaDeNumeros) {
        System.out.println(listaDeNumeros);
    }

}
