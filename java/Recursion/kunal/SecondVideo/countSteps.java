package SecondVideo;

public class countSteps {
    // static int cn=0;
    // public static int helper(int n ){
    //     if(n <= 0) return cn;
    //     if(n % 2 == 0){       
    //         cn++;
    //         return helper(n/2);
    //     }
    //     cn++;
    //     return helper(n-1);
    // }
    
    public static int helper(int n , int cn){
        if(n <= 0) return cn;
        if(n % 2 == 0){
            return helper(n/2,cn+1);
        }
        return helper(n-1,cn+1);
    }

    public static int no(int x){
        return helper(x , 0);
    }
    public static void main(String[] args) {
        System.out.println(no(9));
    }
}
