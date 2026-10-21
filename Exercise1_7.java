/**
 * Exercise 1.7 - String.substring demo
 *
 * Question: How long is the string returned by
 *   "I love java programming".substring(7, 11)  ?
 * What is the string?
 *
 * Answer: the string is "java" and its length is 4.
 * Java's substring(begin, end) includes begin but excludes end,
 * so it returns the characters at indexes 7, 8, 9 and 10.
 */
public class Exercise1_7 {

    public static void main(String[] args) {
        String text = "I love java programming";

        String result = text.substring(7, 11);

        System.out.println("Original string:  \"" + text + "\"");
        System.out.println("substring(7, 11): \"" + result + "\"");
        System.out.println("Length:           " + result.length());
    }
}
