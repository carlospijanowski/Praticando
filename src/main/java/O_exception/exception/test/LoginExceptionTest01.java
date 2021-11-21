package O_exception.exception.test;

import O_exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginExceptionTest01 {

    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {

        Scanner scanner = new Scanner(System.in);
        String usuario="Carlos";
        String senha="123";

        System.out.println("Digite o usuário.:");
        String usuarioInformado = scanner.nextLine();
        System.out.println("Digite a senha.:");
        String senhaInformada = scanner.nextLine();

        if(!usuario.equalsIgnoreCase(usuarioInformado) || !senha.equalsIgnoreCase(senhaInformada)){
            throw new LoginInvalidoException("usuario nao localizado - entramos na Excecao personalizada");
        }

        System.out.println("Seja bem vindo "+usuario);
    }


}
