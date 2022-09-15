import java.util.Scanner;
public class A1Q3 {
    public static void main(String args[]){
        int a ; // Numerator
        int b ; // Denomirator
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Quotient " + a/b);
        System.out.println("Remainder " + a%b);
        sc.close();

    }

}
