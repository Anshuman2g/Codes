package SecondVideo;

public class printnumbers {
    public static void no(int n){
        if( n == 0){
           return;
        }
        System.out.println(n);
        no(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        no(5);
    }
}
