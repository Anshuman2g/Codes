package SecondVideo;

public class countzeros {
    // static int cn =0;
    // public static int no(int n){
    //           if(n == 0) return 0 ;
    //         if(n  % 10 == 0){
    //             cn++;
    //         }
    //        no(n/10);         //simple code
    //        return cn;
    //       }
    
    
     public static int no(int n){
        return helper(n,0);
     }
     public static int helper(int n , int cn){
        if( n == 0) return cn;
        if(n % 10 == 0){
            return  helper(n/10, cn +1);
        }
        return helper(n/10,cn);
     }
    public static void main(String[] args) {
         System.out.println(no(102020));
    }
}
