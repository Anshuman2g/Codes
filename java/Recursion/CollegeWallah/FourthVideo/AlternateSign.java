package CollegeWallah.FourthVideo;

public class AlternateSign {
    // static int ans = 0;
    // public static void no(int num){
    //     if(num == 0) return;
    //     if(num%2 == 0){
    //         ans-=num;
    //         no(num-1);
    //     }
    //     else{
    //     ans+=num;
    //     no(num-1);
    //     }
    // }

    public static int no(int num){
        if( num == 0) return 0;
        if(num % 2 == 0){
            return no(num-1)-num;
        }
        else{
            return no(num-1)+num;
        }
    }
    public static void main(String[] args) {
        int num=10;
        // no(num);
        // System.out.println(ans);
        System.out.println(no(num));
    }
}
