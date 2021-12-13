package testesAvulsos;

public class Teste {

    public static void main(String[] args) {

        String[] str = {"fabio","nascimento","1986"};

        for(int i=0;i<str.length;i++ ) {
            if(str[i].matches("[0-9]+")) {
                System.out.println("Match: " + str[i]);
            }
        }

    }

}
