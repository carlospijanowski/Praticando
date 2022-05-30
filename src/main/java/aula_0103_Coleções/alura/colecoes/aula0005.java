package aula_0103_Coleções.alura.colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

/**
 * o poder dos sets em Alura
 */
public class aula0005 {

    public static void main(String[] args) {

        HashSet<String> objects = new HashSet<>();
        objects.add("Carlos");
        objects.add("Tatiana");
        objects.add("Laura");
        objects.add("Laura");// duplicado em conjunto nao rola!
        objects.add("1");

        System.out.println(objects);

        Collection<String> strings = new ArrayList<>(objects);//colocando em uma list
        Optional<String> first = strings.stream().findFirst();
        System.out.println(first.get());

    }

}
