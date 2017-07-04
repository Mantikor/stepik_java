/**
 * (c) 2017 Streltsov Sergey
 * Checks if given value is a power of two.
 * value - any number
 * return - true when value is power of two, false otherwise
 */

public class PowOfTwo {
    public static boolean isPowerOfTwo(int value) {
        if (value != 0) {
            return (Math.abs(value) & (Math.abs(value) - 1)) == 0;
        }
        return false;
    }
    public static char charExpression(int a) {
        return (char)('\\'+a);
    }
}
