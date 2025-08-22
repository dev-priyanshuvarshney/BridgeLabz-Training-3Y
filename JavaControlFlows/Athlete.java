package JavaControlFlows;

import java.util.Scanner;

public class Athlete {
    public static double triangularPark(int s1, int s2, int s3){
        double peri = s1+s2+s3;
        double rounds = 5000/peri;
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        double rounds = Math.ceil(triangularPark(side1, side2, side3));
        System.out.println(rounds);
    }
}
