import java.util.*;
class HaliStone1 {
    static int c;
 
    // function to print hailstone numbers
    // and to calculate the number of steps
    // required
    static int HailstoneNumbers(int N)
    {
        System.out.print(N + " ");
 
        if (N == 1 && c == 0) {
 
            // N is initially 1.
            return c;
        }
        else if (N == 1 && c != 0) {
 
            // N is reduced to 1.
            c++;
            return c;
        }
        else if (N % 2 == 0) {
 
            // If N is Even.
            c++;
            HailstoneNumbers(N / 2);
        }
        else if (N % 2 != 0) {
 
            // N is Odd.
            c++;
            HailstoneNumbers(3 * N + 1);
        }
        return c;
    }
public class A3Q4 {
    public static void main(String args[]){
        

 
    // Driver code
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt();
    sc.close();
        int x;
 
        // Function to generate Hailstone
        // Numbers
        x = HailstoneNumbers(N);
 
        // Output: Number of Steps
        System.out.println();
        System.out.println("Number of Steps: " + x);
    
}
    }
}
