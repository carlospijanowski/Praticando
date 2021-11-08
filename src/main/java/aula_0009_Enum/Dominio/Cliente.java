package aula_0009_Enum.Dominio;

public class Cliente {

    String nome;
    int tipoCliente;
    TipoDePessoa tipoDePessoa;
    TipoDePagamento tipoDePagamento;

    public Cliente(String nome, TipoDePessoa tipoDePessoa, TipoDePagamento tipoDePagamento) {
        this.nome = nome;
        this.tipoDePessoa = tipoDePessoa;
        this.tipoDePagamento=tipoDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoDePessoa=" + tipoDePessoa.getTipo() +
                ", tipoDePagamento=" + tipoDePagamento +
                '}';
    }
}
