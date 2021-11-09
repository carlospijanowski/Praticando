package L_classesAbstratas.dominio;

import lombok.ToString;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario=this.salario + this.salario * 0.2;
    }
}
