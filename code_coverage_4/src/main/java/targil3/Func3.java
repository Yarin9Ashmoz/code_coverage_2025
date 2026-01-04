package targil3;

public class Func3 {

    public static String func3(int x) {
        int result = 10;

        if (x > 0) {
            result = result / x;
        }
        result = result / 0;

        return String.format("result=%d", result);
    }// end of func3


}
