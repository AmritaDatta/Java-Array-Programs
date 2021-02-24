package reversethearray;

public class ReverseTheArray {

    public static void main(String[] args) {
        int[] arr={2,3,4,6,7};
       
        
        for (int index=arr.length-1; index>=0; index--){
            System.out.print(arr[index] +", ");
        }  
    }
}
