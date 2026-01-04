package targil3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestFunc2 {

    Func2 tester = new Func2();

    @Test
    public void testFunc2_Statement() {

        String result = Func2.func2(1, 5);
        String expected = "p=11, q=0";
        assertEquals(expected, result);
    }

    @Test
    public void testFunc2_Branch() {
        String result1 = Func2.func2(1, 5);
        assertEquals("p=11, q=0", result1);

        assertThrows(ArithmeticException.class, () -> {
            Func2.func2(0, 5);
        });
    }

    @Test
    public void testFunc2_Condition() {
        String result1 = Func2.func2(1, 5);
        assertEquals("p=11, q=0", result1);

        assertThrows(ArithmeticException.class, () -> {
            Func2.func2(0, 5);
        });
    }
}