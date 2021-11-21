package O_exeption.runtime.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {

        divisao(5,0);

    }

    private static int divisao(int primeiro, int segundo) {

        if(segundo==0){
            throw new IllegalArgumentException("o segundo numero nao pode ser zero");
        }
        return primeiro/segundo;
    }

}
