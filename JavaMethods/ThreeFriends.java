package JavaMethods;

import java.util.Scanner;

public class ThreeFriends {

    public static int youngestFriend(int[] age){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<age.length;i++) {
            if (age[i] < min) {
                min = age[i];
            }
        }
        return min;
    }

    public static int tallestFriend(int[] height){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<height.length;i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.println("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.println("Enter Amar's height: ");
        int amarHeight = sc.nextInt();
        System.out.println("Enter Akabr's height: ");
        int akbarHeight = sc.nextInt();
        System.out.println("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        int[] age = {amarAge, akbarAge, anthonyAge};
        int[] height = {amarHeight, akbarHeight, anthonyHeight};
        int young = youngestFriend(age);
        int tall = tallestFriend(height);

        System.out.println("Young Friend Age is: "+ young);
        System.out.println("Tallest Friend height is: "+ tall);
    }
}
