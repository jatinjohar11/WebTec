import java.util.Scanner;
public class A1Q4 {
    public static void main(String args[]){
        int a ;
        int b ;
        int s ;
        int k ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.nextInt(); // For without temporary give s = 1 and with temporary give s = 2
        switch (s) {
            case 1:
                 k = a;
                 a = b ;
                 b = k ;
                 System.out.println("First number " + a);
                 System.out.println("Second number " + b);
                break;


            case 2:
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("a " + a);
            System.out.println("b " + b);
                break;

            default:
            System.out.println("Not Valid");
                break;

        }
        sc.close();

    }
}
