package L_classesAbstratas.test;

import L_classesAbstratas.dominio.Desenvolvedor;
import L_classesAbstratas.dominio.Funcionario;
import L_classesAbstratas.dominio.Gerente;
import sun.security.krb5.internal.crypto.Des;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 100);
        System.out.println(gerente);

        Desenvolvedor laura = new Desenvolvedor("Laura", 5000);
        System.out.println(laura);
    }

}
