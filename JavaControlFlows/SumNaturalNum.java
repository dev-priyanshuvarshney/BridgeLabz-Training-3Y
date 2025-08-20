package JavaControlFlows;

import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n){
                sum += i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("While loop sum: " + sum);
            System.out.println("Formula sum: " + formulaSum);
            System.out.println(sum == formulaSum ? "Correct" : "Incorrect");
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
