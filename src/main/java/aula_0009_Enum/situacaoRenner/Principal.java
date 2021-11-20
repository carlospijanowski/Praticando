package aula_0009_Enum.situacaoRenner;

public class Principal {

    public static void main(String[] args) {
        teste();
    }

    private static void teste() {

        String teste;
        teste=CancelledEnum.RECUSADO_PELO_CLIENTE.getMotivo();

        System.out.println(teste);


        System.err.println("finaliza ? -> "+ isFinalizador(1L));
        System.err.println("finaliza ? -> "+ isFinalizador(2L));


    }

    public static boolean isFinalizador (Long a){
        CancelledEnum cancelledEnum = CancelledEnum.getEnum(a);
        return cancelledEnum.isFinaliza();
    }
}
