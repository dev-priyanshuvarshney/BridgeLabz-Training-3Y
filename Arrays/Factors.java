package Arrays;

public class Factors {
    public static void main(String[] args) {
        int num = 51;
        int[] factors = new int[num/2];
        int factorsIndex = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors[factorsIndex++]=i;
            }
        }
        System.out.print("Factors of "+num+" is: ");
        for (int i=0;i<factorsIndex;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
