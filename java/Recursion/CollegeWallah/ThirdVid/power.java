package CollegeWallah.ThirdVid;

public class power {
    public static int no(int p,int q){
        if( q==0) return 1;
        return no(p,q-1)*p ;
    }
    public static void main(String[] args) {
        int p =5;
        int q=3;
       System.out.println(no(p,q));
    }
}
