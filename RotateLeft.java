package rotateleft;

public class RotateLeft {

    public static void main(String[] args) {
        
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        //n determine the number of times an array should be rotated  
        int n = 3;  

        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            
            //Stores the first element of the array  
            int first = arr[0], j;  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first; 
        }
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }
}    
