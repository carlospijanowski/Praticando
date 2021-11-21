package aula0001_methodReference;

import java.util.Arrays;
import java.util.List;

public class ExemplosComMethodReference {


    public static void main(String[] args) {

        aplicacao();
        teste();
    }

    public static void aplicacao(){

        // existem alguns tipos de methods reference
        // ao menos 4 os mais importantes
        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        //como eu imprimiria usando lambda?
        lista.stream().forEach((numeros)-> System.out.println(numeros));

        // ja com o method reference
        lista.stream().forEach(System.out::println);

        lista.stream().map((n)-> multipliquePorDois(n)).forEach(System.out::println);

    }

    public static void teste(){

        List<Integer> listinhaDeTeste = Arrays.asList(1,2,3);

    }


    public static Integer multipliquePorDois(Integer i){
        return i *2;
    }

}
