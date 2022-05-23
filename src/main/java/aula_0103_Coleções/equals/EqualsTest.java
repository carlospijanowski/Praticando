package aula_0103_Coleções.equals;

import lombok.val;

import java.util.ArrayList;
import java.util.Stack;

public class EqualsTest {

    public static void main(String[] args) {

        Smartphone iPhone = new Smartphone("1ABC", "iPhone");
        Smartphone iPhone1 = new Smartphone("1ABC", "iPhone");


        val list = new ArrayList<Smartphone>();
        list.add(iPhone);
        System.out.println(list);

        val list2 = new Stack<Smartphone>();


        //com a anotacao @Equals, retorna true pois há uma sobreescrita do metodo
        System.out.println(iPhone.equals(iPhone1));

        System.out.println(iPhone.hashCode());
        System.out.println(iPhone1.hashCode());

    }

}
