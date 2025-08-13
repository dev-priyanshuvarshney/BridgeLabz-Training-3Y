import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double VolumeCylinder = Math.PI * Math.pow(radius, 2)*height;
        System.out.println(VolumeCylinder);
        sc.close();
    }
}
