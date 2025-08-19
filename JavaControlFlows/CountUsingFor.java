package JavaControlFlows;

import java.util.Scanner;

public class CountUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=num1;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("Rocket Launched");
    }
}
