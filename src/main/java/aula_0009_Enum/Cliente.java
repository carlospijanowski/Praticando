package aula_0009_Enum;

public class Cliente {

    String nome;
    int tipoCliente;
    TipoDePessoa tipoDePessoa;

    public Cliente(String nome, TipoDePessoa tipoDePessoa) {
        this.nome = nome;
        this.tipoDePessoa = tipoDePessoa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoDePessoa=" + tipoDePessoa +
                '}';
    }
}
