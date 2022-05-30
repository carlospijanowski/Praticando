package N_polimorfismo.dominio;

public class Computador extends Produto {

    final double TAXA_DO_IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        return this.valor * TAXA_DO_IMPOSTO;
    }

}
