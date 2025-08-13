import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.pow(radius, 2)*Math.PI;
        System.out.println("Area is:" + area);
        sc.close();
    }
}
