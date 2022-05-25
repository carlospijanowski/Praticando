package aula_0103_Coleções.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao01_aula173 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        Integer[] integers = lista.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));

    }

}
