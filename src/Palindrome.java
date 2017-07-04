/**
 * (c) 2017 Streltsov Sergey
 * Checks if given <code>text</code> is a palindrome.
 * text - any string
 * return - true when text is a palindrome, false otherwise
 */

public class Palindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder rev_text = new StringBuilder(text);
        rev_text = rev_text.reverse();
        return text.equalsIgnoreCase(rev_text.toString());
    }
}
