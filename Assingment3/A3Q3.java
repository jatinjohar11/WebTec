import java.util.Arrays;
class Sorting {
 
    // function to print string in sorted order
        static void sortString(String str) {
            char []arr = str.toCharArray();
            Arrays.sort(arr);
            System.out.print(String.valueOf(arr));
        }
     
    // Driver program to test above function
public class A3Q3 {
    public static void main(String args[]){
        
 

    
        String s = "JatinJohar";
        sortString(s);
    
}
    }
}
