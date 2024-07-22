package CollegeWallah.ThirdVid;

public class sumOfNumber {
    public static int no(int n){
        if(n>=1 && n<= 9) return n;
        return no(n/10) + n%10;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(no(n));
    }
}
