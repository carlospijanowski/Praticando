package methodReference;

import java.util.Arrays;
import java.util.List;

public class ExemplosComMethodReference {


    // existem alguns tipos de methods reference
    // ao menos 4 os mais importantes

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Carlos","Pijanowski","Cartaxo");
        //como eu imprimiria ?

        lista.stream().forEach((texto)->{
            System.out.println(texto);
        });

        // ja com o method reference

        lista.stream().forEach(System.out::println);

    }


}
