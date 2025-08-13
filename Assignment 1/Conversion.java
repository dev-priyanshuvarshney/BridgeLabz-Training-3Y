import java.util.*;

public class Conversion {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        double fahrenheit = (celsius*9/5)+32;
        System.out.println("Fahrenheit: "+ fahrenheit);
        sc.close();
    }
}
