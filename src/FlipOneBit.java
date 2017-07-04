/**
 * (c) 2017 Streltsov Sergey
 * Flips one bit of the given value.
 * value - any number
 * bitIndex - index of the bit to flip, 1 <= bitIndex <= 32
 * return - new value with one bit flipped
 */

public class FlipOneBit {
    public static int flipBit(int value, int bitIndex) {
        return (value ^ 1 << (bitIndex-1));
    }
}
