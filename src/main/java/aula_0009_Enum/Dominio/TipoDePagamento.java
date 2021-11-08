package aula_0009_Enum.Dominio;

public enum TipoDePagamento {
    CARTAODECREDITO{
        @Override
        public double desconto(double desconto) {
            return desconto*0.05;
        }
    },
    CARTAODEDEBITO{
        @Override
        public double desconto(double desconto) {
            return desconto*0.1;
        }
    };

    public abstract double desconto(double desconto);


}
