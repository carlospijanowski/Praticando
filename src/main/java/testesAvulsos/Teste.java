package testesAvulsos;

import org.springframework.beans.factory.annotation.Value;

public class Teste {

    @Value("111")
    private String senha;

    public static void main(String[] args) {

        String[] str = {"fabio", "nascimento", "1986"};

        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("[0-9]+")) {
                System.out.println("Match: " + str[i]);
            }
        }

//        Teste teste = new Teste();
//        teste.senha="Carlos";
//        System.out.println("senha.: "+ teste.senha.length());

    }



}
