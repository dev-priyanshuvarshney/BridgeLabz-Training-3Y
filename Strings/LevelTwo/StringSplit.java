package Strings.LevelTwo;

import java.util.Scanner;

public class StringSplit {
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
    public static String[] splitString(String str){
        int n = lengthString(str);
        int wordcount = 1;
        for (int i=0;i<n;i++){
          if(str.charAt(i)==' '){
              wordcount++;
          }
        }
        String[] words = new String[wordcount];
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word.append(ch);
            } else{
                words[index++] = word.toString();
                word.setLength(0);
            }
        }
        words[index] = word.toString();
        return words;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = splitString(str);
        for (String w : words){
            System.out.println(w);
        }
    }
}
