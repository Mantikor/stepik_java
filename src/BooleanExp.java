/**
 * (c) 2017 Streltsov Sergey
 */

public class BooleanExp {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int count = 0;
        if (a) count++;
        if (b) count++;
        if (c) count++;
        if (d) count++;
        if (count == 2) return true;
    else return false;
    }
}
