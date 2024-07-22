package SecondVideo;

public class SumOfDigits {
    public static int no(int n){
        if(n>=0 && n<=9) return n;
        return no(n/10)+n%10;
    }
    public static void main(String[] args) {
        System.out.println(no(55551));
    }
}
 