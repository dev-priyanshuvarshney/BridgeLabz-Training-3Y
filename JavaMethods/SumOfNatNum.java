package JavaMethods;

import java.util.Scanner;

public class SumOfNatNum {

    public static int sumNat(int n){
        int i=1;
        int sum=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }

    public static int sumFormula(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(sumNat(num) == sumFormula(num)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }


    }
}
