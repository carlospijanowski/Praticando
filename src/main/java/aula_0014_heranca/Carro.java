package aula_0014_heranca;

public class Carro {

    public void iniciar() {
        System.out.println("inicia o carro padrão");
    }

    public void acelerar() {
        System.out.println("acelerando o carro padrão");
    }

    public void frear() {
        System.out.println("freando o carro padrão");
    }


    public static void main(String[] args) {

        Carro gol = new Gol();
        gol.iniciar();
        gol.acelerar();
        gol.frear();

    }
}

class Gol extends Carro {

    @Override
    public void iniciar() {
        System.out.println("inicia o Gol");
    }

    public void acelerar() {
        System.out.println("acelerando o Gol");
    }

    public void frear() {
        System.out.println("freando o Gol");
    }

}


class Uno extends Carro {

    public void iniciar() {
        System.out.println("inicia o Uno");
    }

    public void acelerar() {
        System.out.println("acelerando o Uno");
    }

    public void frear() {
        System.out.println("freando o Uno");
    }

}

