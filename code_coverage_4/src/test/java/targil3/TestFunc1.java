package targil3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestFunc1 {

    Func1 tester = new Func1();

    @Test
    public void testFunc1_Condition() { //conditions cant get 100% without getting error

        int testCase1 = Func1.func1(1, 0,20);
        int exp1 = 2;
        assertEquals(exp1, testCase1);

        //find error here, division by zero error
        assertThrows(ArithmeticException.class, () -> {
            Func1.func1(0, 5,20);
        });
    }

//    @Test
//    public void testFunc1_Statement() { // statements get 100% and without getting division by zero exception
//        assertThrows(ArithmeticException.class, () -> {
//            Func1.func1(0, 5, 20);
//        });
//
//        int testCase2 = Func1.func1(1,0,20);
//        int exp2 = 2;
//        assertEquals(exp2, testCase2);
//    }

//    @Test
//    public void testFunc1_Branch() { // branchs get 100% without getting division by zero error
//
//        String testCase1 = Func1.func1(0, 5); // test case 1 gets 50% coverage!
//        String exp1 = "BIG";
//        assertEquals(exp1, testCase1);
//
//        String testCase2 = Func1.func1(1, 1); // test case 1 gets 100% coverage!
//        String exp2 = "OK";
//        assertEquals(exp2, testCase2);
//    }
//


}// end of class
