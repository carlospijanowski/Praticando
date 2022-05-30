package aula_0103_Coleções.alura.colecoes;

import java.util.ArrayList;

/**
 * mais praticas com relacionamento
 *
 */
public class aula0004 {

    public static void main(String[] args) {

        Aulas a1 = new Aulas("Cozinhando frango", 10);
        Aulas a2 = new Aulas("Cozinhando peixes", 12);

        ArrayList<Aulas> listaComAulas = new ArrayList<>();
        listaComAulas.add(a1);
        listaComAulas.add(a2);

        Curso cursoCulinario = new Curso("Curso culinario", "Carlos", listaComAulas);

        System.out.println(cursoCulinario.getTempoAulas());

    }

}
