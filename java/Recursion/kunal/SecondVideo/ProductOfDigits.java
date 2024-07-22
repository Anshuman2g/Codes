package SecondVideo;

public class ProductOfDigits{
    public static int no(int n){
        if(n>=0&& n<=9) return n;
        return  (n%10) * no(n/10);
    }
    public static void main(String[] args) {
        System.out.println(no(1239));
    }
}