package N_polimorfismo.dominio;

public abstract class Produto implements TaxaDeImposto{

    protected String nome;
    protected double valor;

    protected Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
