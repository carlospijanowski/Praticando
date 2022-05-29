package alura.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class aula0002  {

    public static void main(String[] args) {

        Aulas a1  = new Aulas("primeiro tipo de aula", 10);
        Aulas a2  = new Aulas("segundo tipo de aula", 9);
        Aulas a3  = new Aulas("terceiro tipo de aula", 15);

        List<Aulas> objects = new ArrayList<>();

        objects.add(a1);
        objects.add(a2);
        objects.add(a3);

        Collections.sort(objects);

        objects.sort(Comparator.comparing(Aulas::getTempoAula).reversed());

        System.out.println(objects);

    }


}
