package aula_0012_Listas;

import java.util.HashSet;
import java.util.Iterator;

public class Set {


    public static void main(String[] args) {

//        Set<Integer> setDeNumeros;
//
        HashSet<Integer> setDeNumeros = new HashSet<>();

        setDeNumeros.add(1);
        setDeNumeros.add(2);
        setDeNumeros.add(3);
        setDeNumeros.add(4);


        for (int a = 0; a < 100; a++) {
            setDeNumeros.add(a);
        }

        print(setDeNumeros);

    }

    private static void print(HashSet<Integer> listaDeNumeros) {

        Iterator<Integer> iterator = listaDeNumeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(listaDeNumeros);
        }
    }

}
