package JavaControlFlows;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1%5==0){
            System.out.println(num1+" is Divisible by 5");
        } else {
            System.out.println("Not Divisible by 5");
        }
    }
}
