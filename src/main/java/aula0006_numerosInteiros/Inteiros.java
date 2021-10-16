package aula0006_numerosInteiros;

import java.util.Arrays;
import java.util.List;

public class Inteiros {

    public static void main(String[] args) {

        Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter((n)->n%2==0).forEach(System.out::println);

    }

}
