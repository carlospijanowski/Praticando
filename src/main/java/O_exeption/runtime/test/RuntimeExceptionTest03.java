package O_exeption.runtime.test;

/***
 * nada de essencialmente novo por aqui
 * veja o codigo com try sem catch e com finally
 */


public class RuntimeExceptionTest03 {

    public static void main(String[] args) {

        String s = abreConexao();
        System.out.println(s);

        abreConexao2();

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
