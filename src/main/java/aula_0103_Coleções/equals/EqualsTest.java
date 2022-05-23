package aula_0103_Coleções.equals;

public class EqualsTest {

    public static void main(String[] args) {

        Smartphone iPhone = new Smartphone("1ABC", "iPhone");
        Smartphone iPhone1 = new Smartphone("1ABC", "iPhone");

        //com a anotacao @Equals, retorna true pois há uma sobreescrita do metodo
        System.out.println(iPhone.equals(iPhone1));

    }

}
