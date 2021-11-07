package aula_0009_Enum;

public enum TipoDePessoa {

    PESSOAFISICA(1),
    PESSOAJURIDICA(2);

    private int valor;

    TipoDePessoa(int valor) {
        this.valor=valor;
    }
}
