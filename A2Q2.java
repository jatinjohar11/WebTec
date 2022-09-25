public class A2Q2 {
    public static void main(String args[]){
        int a=10;
        int b=15;
        int c=17;
        int min;
        if(a<b&&a<c)
            min=a;
        else if(b<a&&b<c)
            min=b;
        else
            min=c;
        System.out.println(min);
    }
}
