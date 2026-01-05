package targil3;

public class Func2 {

    public static String func2 (float p, float q) {

        if (p != 0) {
            p = p + 10;
        }

        // תקלה: חלוקה ב־0 כאשר p == 0
        q = q / p;

        return String.format("p=%.2f, q=%.2f", p, q);
    }// end of func2

}//end of class
