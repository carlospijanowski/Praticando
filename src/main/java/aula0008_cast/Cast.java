package aula0008_cast;

import aula0008_cast.model.Conta;
import aula0008_cast.model.ContaCorrente;
import aula0008_cast.model.ContaPoupanca;

public class Cast {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setConta("0001");

        ContaCorrente contaCorrente = new ContaCorrente();

        Conta conta = new Conta();

        conta = contaPoupanca;



    }
}
