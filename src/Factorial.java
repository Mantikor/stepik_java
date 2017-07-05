/**
 * (c) 2017 Streltsov Sergey
 * Calculates factorial of given value.
 * value - positive number
 * reurn - factorial of value
 */

import java.math.*;

public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger fc = BigInteger.valueOf(1);
        for (; value > 0; value--) {
            fc = fc.multiply(BigInteger.valueOf(value));
        }
        return fc;
    }
}
