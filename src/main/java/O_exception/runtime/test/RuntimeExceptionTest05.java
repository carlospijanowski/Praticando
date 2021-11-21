package O_exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * excecoes em linha
 */

public class RuntimeExceptionTest05 {

    public static void main(String[] args) {

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        }


        try{
            deveLancarUmaExcecao();
        }catch (SQLException | IOException e){

        }


    }

        public static void deveLancarUmaExcecao () throws SQLException, FileNotFoundException {

        }


}
