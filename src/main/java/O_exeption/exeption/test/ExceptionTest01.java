package O_exeption.exeption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

    public static void main(String[] args) {

        System.out.println("caracter de scape \\ por isso imprime apenas uma ");

        criarArquivo();

    }

    private static void criarArquivo(){
        File file = new File("arquivos\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated ? "criado com sucesso" : "arquivo já existe");
        } catch (IOException e) {
            e.getMessage();
            System.out.println("mensagem do erro -> "+e);
            e.printStackTrace();
        }
    }

}
