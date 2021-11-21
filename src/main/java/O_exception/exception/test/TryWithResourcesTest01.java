package O_exception.exception.test;

import O_exception.exception.dominio.Leitor1;
import O_exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo();
    }

    private static void lerArquivo() {
        try (
                Leitor1 leitor1 = new Leitor1();
                Leitor2 leitor2 = new Leitor2();

        ) {

        } catch (Exception e) {

        }
    }

    private static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
