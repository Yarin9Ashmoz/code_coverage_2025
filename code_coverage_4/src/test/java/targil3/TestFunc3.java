package targil3;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TestFunc3 {
    Func3 tester = new Func3();

    @Test
    public void testFunc3_Statement() {
        assertThrows(ArithmeticException.class, () -> {
            Func3.func3(1);
        });
    }

    @Test
    public void testFunc3_Branch() {
        assertThrows(ArithmeticException.class, ()->{ // this test get True branch
            Func3.func3(1);
        });

        assertThrows(ArithmeticException.class, ()->{ // this test get False branch
            Func3.func3(0);
        });
    }


    @Test
    public void testFunc3_Condition() {
        assertThrows(ArithmeticException.class, ()->{ // this test gets True in condition x>0
            Func3.func3(1);
        });

        assertThrows(ArithmeticException.class, ()->{ // this test gets False in condition x>0
            Func3.func3(0);
        });
    }


}//end of class
