package aula_0103_Coleções.tests;

import aula_0103_Coleções.dominio.Consumidor;
import aula_0103_Coleções.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02_aula179 {

    public static void main(String[] args) {

        Consumidor c1 = new Consumidor("Carlos");
        Consumidor c2 = new Consumidor("Tatiana");

        Manga manga01 = new Manga(1, "Parsek", 15.00, 10);
        Manga manga02 = new Manga(2, "Pokemon", 13.00, 10);
        Manga manga03 = new Manga(3, "Jaspion", 20.00, 10);
        Manga manga04 = new Manga(4, "Caverna do Dragão", 2.00, 10);

        Map<Consumidor, Manga> juntando = new HashMap<>();
        juntando.put(c1,manga02);
        juntando.put(c2,manga03);

        for (Map.Entry<Consumidor, Manga> map : juntando.entrySet()){
            System.out.println(map.getKey().getNome() + " | " +map.getValue().getNome());
        }

    }

}
