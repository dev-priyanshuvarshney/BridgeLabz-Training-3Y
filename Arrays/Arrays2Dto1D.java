package Arrays;

public class Arrays2Dto1D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int[] newarr = new int[arr.length*arr[0].length];
        int arrIndex=0;
        System.out.println("2D array is: ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                newarr[arrIndex++]=arr[i][j];
            }
        }
        System.out.println("\n1D Array is: ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
    }
}
