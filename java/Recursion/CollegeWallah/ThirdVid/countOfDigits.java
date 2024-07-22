package CollegeWallah.ThirdVid;

public class countOfDigits {
    public static int no(int n){
        if(n>=1 && n<=9) return 1;
        return no(n/10) + 1;
    }
    public static void main(String[] args) {
        int n=12345;
        System.out.println(no(n));
    }
}
