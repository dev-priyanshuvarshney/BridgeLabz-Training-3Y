package Strings.LevelTwo;

import java.util.Scanner;

public class StringLength {
    public static int lengthString(String str){
        int count = 0;
        try{
            while (true){
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int manualLength = lengthString(str);
        int automatically = str.length();

        System.out.println(manualLength);
        System.out.println(automatically);
    }
}
