package aula_0009_Enum.Dominio;

public enum TipoDePessoa {


    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String tipo;

    TipoDePessoa(int valor, String tipo) {
        this.valor=valor;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
