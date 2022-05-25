package aula_0103_Coleções.tests;

import aula_0103_Coleções.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {

    public static void main(String... args) throws InterruptedException {

        List<Manga> listaDeMangas = new ArrayList<>();

        listaDeMangas.add(new Manga(1, "Parsek", 15.00, 10));
        listaDeMangas.add(new Manga(2, "Pokemon", 13.00, 10));
        listaDeMangas.add(new Manga(3, "Jaspion", 20.00, 10));
        listaDeMangas.add(new Manga(4, "Caverna do Dragão", 2.00, 10));

        Iterator<Manga> iteratorManga = listaDeMangas.listIterator();

        while (iteratorManga.hasNext()) {
            if (iteratorManga.next().getPreco() == 20.00) {
                iteratorManga.remove();
            }
        }

        System.out.println(listaDeMangas);

        System.err.println("-----------------------------------------------------");

        Thread.sleep(1000);

        // acima temos exemplo de programacao imperativa

        // abaixo, conseguimos um mesmo resultado com programação funcional

        listaDeMangas.removeIf(qualquerNome -> qualquerNome.getNome().equals("Caverna do Dragão"));
        System.out.println(listaDeMangas);


    }

}
