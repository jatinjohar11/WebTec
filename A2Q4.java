public class A2Q4 {
    public static void main(String args[]){
        int p=80000;
        int r=0;
        while(p<=150000){
            p*=105;
            p/=100;
            r++;
        }
        System.out.println(r);
    }
}
