package Strings.Level1;
import java.util.*;
public class NumberFormatDemo {
    public static void generateException(String text) {
        System.out.println("Generating Exception...");
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        System.out.println("Handling Exception...");
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        // generateException(text);
        handleException(text);
        sc.close();
    }
}