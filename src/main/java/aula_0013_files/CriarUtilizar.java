package aula_0013_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CriarUtilizar {

    public static void main(String[] args) {

        try {
            criarArquivo();
        } catch (IOException e) {
            System.out.println("ja existe");
        }

    }

    public static void criarArquivo() throws IOException {

        Path path = Path.of("C:\\Users\\carlos.cartaxo\\Documents\\teste.txt");

//        if (Files.notExists(path)) {
//            Path file = Files.createFile(path);
//        }
//
//        String texto = "ooooi";
//
//        byte[] bytes = texto.getBytes(StandardCharsets.UTF_8);
//        Files.write(path,bytes);

//        Files.writeString(path,"ooooi");


        List<String> strings = Files.readAllLines(path);

        String readString = Files.readString(path);

//        System.out.println(strings);
        System.out.println(readString);



        fazer();

    }



    public static void fazer() throws IOException {

        Path path = Path.of("C:\\Users\\carlos.cartaxo\\Documents\\teste.txt");

        if(Files.exists(path)){
            System.out.println("Existe");
        }

        Files.createFile(path);

    }


}
