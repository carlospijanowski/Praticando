package L_classesAbstratas.dominio;

import lombok.ToString;

/**
 * Atenção... dica Dojo
 * classes abstratas podem classes concretas porém
 * classes concretas nao podem ter classes abstratas
 * */
@ToString
public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();


}
