package aula_0103_Coleções.tests;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {


    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pijanowski");

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-------------------------------");

        for(int i = 0; i < nomes.size(); i++){
            System.err.println(nomes.get(i));
        }

    }

}
