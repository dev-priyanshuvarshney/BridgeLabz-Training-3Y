package Arrays;

public class OddEvenArray {
    public static void main(String[] args) {
        int num = 20;
        if (num <= 0) {
            System.out.println("Error: Enter a natural number greater than 0.");
            return;
        }
        int[] even = new int[num/2+1];
        int[] odd = new int[num/2+1];
        int evenIndex = 0;
        int oddIndex = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even[evenIndex++]=i;
//                evenIndex++;
            } else{
                odd[oddIndex++]=i;
//                oddIndex++;
            }
        }
        System.out.println("Even Numbers: ");
        for (int i=0;i<evenIndex;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println("\nOdd Numbers: ");
        for(int i=0;i<oddIndex;i++){
            System.out.print(odd[i]+" ");
        }
    }
}
