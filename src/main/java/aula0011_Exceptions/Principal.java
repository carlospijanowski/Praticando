package aula0011_Exceptions;

public class Principal {


    public static void main(String[] args) throws Exception {

        boolean lancarException = true;

        if(lancarException){
            throw new Exception("excecao lancada");
        }

        System.out.println("lancei e sai do if");

    }

}
