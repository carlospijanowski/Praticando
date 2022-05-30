package aula_0103_Coleções.alura.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Maps
 */
public class aula0010 {

    public static void main(String[] args) {

        Map<String, List<Aulas>> objectObjectHashMap = new HashMap<>();

        Aulas a1 = new Aulas("arrumando a casa", 10);
        Aulas a2 = new Aulas("varrendo o chão", 12);
        List<Aulas> listaAulas = new ArrayList<>();
        listaAulas.add(a1);
        listaAulas.add(a2);

        objectObjectHashMap.put("1",listaAulas);

        System.out.println(objectObjectHashMap.get("1"));



    }

}
