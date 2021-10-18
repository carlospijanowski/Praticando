package aula_0009_classes_Estaticas;

public class ClasseEstatica {


    public static void main(String[] args) {
        TesteDeClassesEstaticas.EssaEhEstatica essaEhEstatica = new TesteDeClassesEstaticas.EssaEhEstatica();
        essaEhEstatica.imprimir();

        TesteDeClassesEstaticas testeDeClassesEstaticas = new TesteDeClassesEstaticas();
        TesteDeClassesEstaticas.EssaNaoEhEstatica essaNaoEhEstatica = testeDeClassesEstaticas.new EssaNaoEhEstatica();
        essaNaoEhEstatica.imprimir();
    }



    static class TesteDeClassesEstaticas{

        static class EssaEhEstatica{
            void imprimir(){
                System.out.println("imprimir estacica");
            }
        }

        class EssaNaoEhEstatica{
            void imprimir(){
                System.out.println("imprimir nao estatica");
            }
        }

    }



}
