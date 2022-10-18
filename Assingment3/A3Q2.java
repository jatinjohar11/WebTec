import java.util.*;
class CountingSort {
    void sort(int arr[])
    {
        int n = arr.length;
  
        // The output character array that will have sorted arr
        int output[] = new int[n];
  
        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
  
        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
  
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
  
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
  
        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
}
    // Driver method
public class A3Q2 {
    public static void main(String args[]){
       
            
                CountingSort ob = new CountingSort();
                int i ;
                Scanner sc = new Scanner(System.in);
                System.out.print("Size of input");
                i = sc.nextInt();
                               Random randomNum = new Random();
                               int arr[] = new int[i];
                               for(int j = 0;j<i;j++){
                                int k =randomNum.nextInt(20);
                               arr[j] = k;
                               }
                               sc.close();
                ob.sort(arr);
          
                System.out.print("Sorted character array is ");
                for (int j = 0; j < arr.length; ++j)
                    System.out.print(arr[j]+" ");
        }
    }

