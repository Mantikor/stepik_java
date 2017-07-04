/**
 * (c) 2017 Streltsov Sergey
 */

public class DoubleExp {
    public static boolean doubleExpression(double a, double b, double c) {
        return (Math.abs(a + b - c) <= 0.0001);
    }
}
