package SecondVideo;

public class SumNto1 {
    public static int no(int n){
        if(n == 1) return 1;
        return n + no(n-1);
    }
    public static void main(String[] args) {
        System.out.println(no(5));
    }
}
