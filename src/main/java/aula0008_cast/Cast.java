package aula0008_cast;

import aula0008_cast.model.Conta;
import aula0008_cast.model.ContaPoupanca;

public class Cast {

    public static void main(String[] args) {

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setConta("0001");
        System.out.println(contaPoupanca.getConta());

    }
}
