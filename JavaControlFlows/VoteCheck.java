package JavaControlFlows;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("The Person's Age is "+ age+ " and can Vote");
        } else {
            System.out.println("The Person age is "+age+" and cannot Vote");
        }
    }
}
