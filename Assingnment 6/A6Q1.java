import java.util.*;


public class A6Q1 {
    public static void multiply(int a , int b){
        System.out.println("Multiplication:");
        try{ // monitor a block of code
            if(a==0 || b==0){
                throw new ArithmeticException("Number is zero");
            }
            else {
                System.out.println(a*b);
            }
    
        } catch(ArithmeticException e) {
            System.out.println("You're multplying by zero!");
        }
    }
    public static void divide(int a , int b){
        System.out.println("Division:");
        try{
            if(a==0||b==0){
                throw new ArithmeticException("Number is zero");
            }
            else{
                System.out.println(a/b);
            }
        }
            catch(ArithmeticException e){
System.out.println("Zero is present in Division");
            }
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
       
System.out.println("User Input:");
a = sc.nextInt();
b = sc.nextInt();
       
        multiply(a, b);
        divide(a, b);
       sc.close();
            
        
    }
}
