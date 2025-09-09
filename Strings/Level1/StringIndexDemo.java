package Strings.Level1;
import java.util.*;
public class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        System.out.println("Handling Exception...");
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        handleException(text);

        sc.close();
    }
}
