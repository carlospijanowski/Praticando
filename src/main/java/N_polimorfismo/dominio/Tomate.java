package N_polimorfismo.dominio;

public class Tomate extends Produto{

    final double TAXA_DO_IMPOSTO = 0.03;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * TAXA_DO_IMPOSTO;
    }

}
