package O_exeption.runtime.test;

public class RuntimeExceptionTest03 {

    public static void main(String[] args) {

        String s = abreConexao();
        System.out.println(s);

    }

    private static String abreConexao() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados do aquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liberado pelo SO");

        }
        return "algum problema foi encontrado";
    }

    private static String abreConexao2() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo dados do aquivo");
            return "conexao aberta";
        } finally {
            System.out.println("fechando recurso liberado pelo SO");
            return "algum problema foi encontrado";
        }
    }


}
