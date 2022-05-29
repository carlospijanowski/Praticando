package aula_0103_Coleções.tests;

import aula_0103_Coleções.dominio.Consumidor;
import aula_0103_Coleções.dominio.Manga;

import java.util.HashMap;
import java.util.List;

public class MapTest03_aula180 {

    public static void main(String[] args) {

        Consumidor c1 = new Consumidor("Carlos");
        Consumidor c2 = new Consumidor("Tatiana");

        Manga manga01 = new Manga(1, "Parsek", 15.00, 10);
        Manga manga02 = new Manga(2, "Pokemon", 13.00, 10);
        Manga manga03 = new Manga(3, "Jaspion", 20.00, 10);
        Manga manga04 = new Manga(4, "Caverna do Dragão", 2.00, 10);

        List<Manga> mangaListC1 = List.of(manga01,manga02);
        List<Manga> mangaListC2 = List.of(manga01,manga02,manga03,manga04);

        HashMap<Consumidor, List<Manga>> map = new HashMap<>();
        map.put(c1,mangaListC1);
        map.put(c2,mangaListC2);



    }

}
