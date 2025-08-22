package JavaMethods;

import java.util.Random;

public class RandomArray {

    public static double[] findAvgMinMax(int[] arr){
        int sum=0;
        double max = arr[0];
        double min = arr[0];
        for(int i:arr){
            sum=sum+i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        double avg = (double) sum/arr.length;
        return new double[]{avg, max, min};
    }
    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= 1000 + rand.nextInt(9000);
        }
        System.out.println("Your Array is: ");
        for(int i: arr){
            System.out.println(i);
        }

        double result[] = findAvgMinMax(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }
}
