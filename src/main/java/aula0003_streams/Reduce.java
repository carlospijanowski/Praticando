package aula0003_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

    //reduce -> pega todos os elementos em um unico elemento
    //todo existe mais coisas a estudar sobre esse topico em https://www.youtube.com/watch?v=2aHElyENpuM&t=887s

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        reduceSoma(lista);
        reduceSubtracao(lista);
        reduceMultiplicacao(lista);
        reduceComStrings();

    }

    public static void reduceSoma(List<Integer> lista){
        Optional<Integer> acumuladorDeResultado = lista.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println("reduceSoma -> "+ acumuladorDeResultado.get());
    }

    public static void reduceSubtracao(List<Integer> lista){
        System.err.println("Não faça a subtracao pois não é associativa.\n" +
                "A api do java nao garante que isso sempre mostrará um resultado de fato esperado.\n" +
                "Exemplo.: (1-2) - (3-4) - (5-6) não mostra um resultado diferente de paralel");
    }

    public static void reduceMultiplicacao(List<Integer> lista){
        Optional<Integer> acumuladorDeResultado = lista.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println("reduceMultiplicacao -> "+acumuladorDeResultado.get());
    }

    public static void reduceComStrings(){
        String s = "C A R L O S";
        String[] split = s.split(" ");
        List<String> palavrao = Arrays.asList(split);
        Optional<String> reduceString = palavrao.stream().reduce((str1, str2) -> str1.concat(str2));
        System.out.println(reduceString.get());
    }

}
