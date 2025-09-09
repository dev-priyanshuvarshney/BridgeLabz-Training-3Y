package Strings.LevelOne;
import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        System.out.println("Handling Exception...");
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
         generateException(text);
        handleException(text);
        sc.close();
    }
}
