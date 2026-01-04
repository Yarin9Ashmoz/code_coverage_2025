package targil3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestFunc1 {

    Func1 tester = new Func1();

    @Test
    public void testFunc1_Statement(){ // statements get 100% without getting division by zero error

        String testCase1 = Func1.func1(1, 5); // test case 1 gets 100% coverage!
        String exp1 = "BIG";
        assertEquals(exp1, testCase1);

    }

    @Test
    public void testFunc1_Branch(){ // branchs get 100% without getting division by zero error

        String testCase1 = Func1.func1(1,5); // test case 1 gets 50% coverage!
        String exp1 = "BIG";
        assertEquals(exp1, testCase1);

        String testCase2 = Func1.func1(1,1); // test case 1 gets 100% coverage!
        String exp2 = "OK";
        assertEquals(exp2, testCase2);
    }

    @Test
    public void testFunc1_Condition(){ //conditions cant get 100% without getting error

        String testCase1 = Func1.func1(1, 5);
        String exp1 = "BIG";
        assertEquals(exp1, testCase1);

        assertThrows(ArithmeticException.class,()->{ //find error here, division by zero error
            Func1.func1(0,5);
        });

    }



}// end of class
