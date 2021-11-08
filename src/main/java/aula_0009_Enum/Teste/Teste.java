package aula_0009_Enum.Teste;

import aula_0009_Enum.Dominio.Cliente;
import aula_0009_Enum.Dominio.TipoDePagamento;
import aula_0009_Enum.Dominio.TipoDePessoa;

public class Teste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", TipoDePessoa.PESSOAFISICA, TipoDePagamento.CARTAODECREDITO);
        System.out.println(cliente);

        System.out.println(TipoDePagamento.CARTAODECREDITO.desconto(100));
        System.out.println(TipoDePagamento.CARTAODEDEBITO.desconto(100));
    }

}
