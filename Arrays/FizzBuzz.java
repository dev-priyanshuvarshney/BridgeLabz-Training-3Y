package Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        int[] arr = {6,3,15,9};
        String[] newArr = new String[arr.length];
        int newIndex = 0;
        for(int i=0;i<arr.length;i++){
//            if(arr[i]%3==0){
//                newArr[newIndex++]="Fizz";
//            }
//            else if(arr[i]%5==0){
//                newArr[newIndex++]="Buzz";
//            }
//            else if(arr[i]%3==0 && arr[i]%5==0){
//                newArr[newIndex++]="FizzBuzz";
//            }
//            else{
//                newArr[newIndex++]="NA";
//            }

            switch (0){
                case 0:
                    if(arr[i]%3==0 && arr[i]%5==0){
                        newArr[newIndex++]="FizzBuzz";
                        break;
                }
                case 1:
                    if (arr[i]%3==0){
                        newArr[newIndex++]="Fizz";
                        break;
                    }
                case 2:
                    if(arr[i]%5==0){
                        newArr[newIndex++]="Buzz";
                        break;
                    }
                default:
                    newArr[newIndex++]="NA";
            }
        }
        for(int i=0;i<newIndex;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
