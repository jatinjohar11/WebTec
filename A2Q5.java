import java.util.*;
public class A2Q5 {
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("n n^2 n^3 n^4");
        for(int i=1;i<=n;i++){
            int k=i;
            System.out.print(k+" ");
            k*=i;
            System.out.print(k+" ");
            k*=i;
            System.out.print(k+" ");
            k*=i;
            System.out.print(k+" ");
            System.out.println();
        }
        sc.close();
    }
}
