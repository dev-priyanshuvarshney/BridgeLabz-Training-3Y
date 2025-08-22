package JavaMethods;

import java.util.Scanner;

public class FactorNum {
    public static int[] displayFactor(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumFactor(int[] factor){
        int sum=0;
        for(int f:factor){
            sum=sum+f;
        }
        return sum;
    }

    public static double sumofSquare(int[] factor){
        double sum = 0;
        for(int f:factor) {
            double sq = Math.pow(f, 2);
            sum+=sq;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] factors = displayFactor(num1);
        for (int f : factors) System.out.println(f);

        System.out.println(sumFactor(factors));

        System.out.println(sumofSquare(factors));
    }
}
