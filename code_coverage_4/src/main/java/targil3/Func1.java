package targil3;

public class Func1 {

    public static int func1(int x, int y, int z) {
        int res = 0;

        if ((x != 0) & (y == 0)) {
            res = z / 10;
        }
        res = res / x;

        return res;
    }// end of func1


}//end of class
