package SecondVideo;

public class reverseNo {
    // public static int rev(int n){
    //     int ans =0;
    //     while(n>0){
    //         ans = ans*10+n%10;
    //         n/=10;
    //     }
    //     return ans;
    // }
    static int ans = 0;
    public static void rev(int n){
        if(n == 0){
            return ;
        }
        ans = ans * 10 + n%10;
        rev(n/10);
    }

    // static boolean pal(int n){
    //      if( n == ans){               //palindromic function
    //         return true;
    //      }
    //      return false;
    // }
    public static void main(String[] args) {
        int n=123;
        rev(n);
        System.out.println(ans);
    //    System.out.println( pal(n));
    }
}
