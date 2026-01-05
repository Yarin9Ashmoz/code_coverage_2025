package targil3;

public class Func2 {

    public static String func2 (int p, int q) {

        if (p != 0) {
            p = p + 10;
        }

        // תקלה: חלוקה ב־0 כאשר p == 0
        q = q / p;

        return String.format("p=%d, q=%d", p, q);
    }// end of func2

}//end of class
