package CollegeWallah.SecondVid;

public class fibonacii {
    public static int fb(int n){
        if(n == 0 || n==1){
            return n;
        }
       
         return fb(n-1)+fb(n-2);
        
    }
    public static void main(String[] args) {
        int n =3;
        int ans=fb(n);
        System.out.println(ans);
    }
}
