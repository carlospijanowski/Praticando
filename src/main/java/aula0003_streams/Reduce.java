package aula0003_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    //reduce -> pega todos os elementos em um unico elemento

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        reduceSoma(lista);
        reduceMultiplicacao(lista);
        reduceComStrings();

    }

    public static void reduceSoma(List<Integer> lista){
        Optional<Integer> acumuladorDeResultado = lista.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(acumuladorDeResultado.get());
    }

    public static void reduceMultiplicacao(List<Integer> lista){
        Optional<Integer> acumuladorDeResultado = lista.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println(acumuladorDeResultado.get());
    }

    public static void reduceComStrings(){
        String s = "C A R L O S";
        String[] split = s.split(" ");
        List<String> palavrao = Arrays.asList(split);
        Optional<String> reduceString = palavrao.stream().reduce((str1, str2) -> str1.concat(str2));
        System.out.println(reduceString.get());
    }

}
