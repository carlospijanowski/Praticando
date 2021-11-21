package O_exeption.runtime.test;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

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
