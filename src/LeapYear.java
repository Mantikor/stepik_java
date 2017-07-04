/**
 * (c) 2017 Streltsov Sergey
 */

public class LeapYear {
    public static int leapYearCount(int year) {
        int count = (int)year/4 - (int)year/100 + (int)year/400;
        return count;
    }
}
