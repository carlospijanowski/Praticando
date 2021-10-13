package aula0004_interfaces;

public class Interfaces_default_implementacoesLivres {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.Correr();
        pessoa.Andar();

    }

    public static class Pessoa implements correndo {
        @Override
        public void Correr() {
            System.out.println("correndo muito!");
        }
    }

    interface correndo {
        void Correr();
        default void Andar(){
            System.out.println("andando");
        }
    }

}
