import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int add = n1+n2;
        System.out.println("Addition is: "+ add);
        sc.close();
    }
}
