package JavaMethods;

import java.util.Arrays;

public class NumberChecker {

    public static int[] countDigits(int n){
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int[] a = new int[count];
        temp = n;
        for (int i = count - 1; i >= 0; i--) {
            a[i] = temp % 10;
            temp = temp / 10;
        }
        return a;
    }

    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int[] digits, int original) {
        int n = digits.length;
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return (int)sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = countDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        if (isDuck(digits)){
            System.out.println(num + " is a Duck Number.");
        }
        else {
            System.out.println(num + " is NOT a Duck Number.");
        }
        if (isArmstrong(digits, num)){
            System.out.println(num + " is an Armstrong Number.");
        }
        else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
    }
}
