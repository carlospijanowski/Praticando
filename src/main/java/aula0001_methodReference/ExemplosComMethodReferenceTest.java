package aula0001_methodReference;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExemplosComMethodReferenceTest {

    @Test
    public void testMain() {
        ExemplosComMethodReference.main(new String[]{"args"});
    }

    @Test
    public void testMultipliquePorDois() {
        Integer result = ExemplosComMethodReference.multipliquePorDois(Integer.valueOf(0));
        Assertions.assertEquals(Integer.valueOf(0), result);
    }
}
