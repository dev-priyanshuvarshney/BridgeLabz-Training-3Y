package JavaControlFlows;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if(num1>0){
            System.out.println("Your num" +num1+ "is Positive ");
        } else if(num1<0){
            System.out.println("Your num"+ num1+" is Negative");
        } else if(num1==0){
            System.out.println("Your num is Zero");
        }
    }
}
