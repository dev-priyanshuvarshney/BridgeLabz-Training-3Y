package Strings.LevelOne;
import java.util.*;
public class StringToCharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userDefinedArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("Characters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        boolean comparisonResult = compareArrays(userDefinedArray, builtInArray);

        if (comparisonResult) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are different.");
        }

        sc.close();
    }

    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
