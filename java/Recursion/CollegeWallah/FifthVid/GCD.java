package CollegeWallah.FifthVid;

public class GCD {
    public static void main(String[] args) {
        // int x=4;
        // int y=8;
        // int min=0;              //BRUTE FORCE
        // min=Math.min(x,y);
        // int gcd=0;
        // for(int i=1;i<=min;i++){
        //   if(x%i == 0 && y%i == 0){
        //      gcd=i;
        //   }
        // }
        // System.out.println(gcd);




        // int x=5;                //LONG DIVISION APPROACH
        // int y=15;
        // while( x%y != 0){
        //     int rem =x%y;
        //     x=y;
        //     y=rem;
        // }
        // System.out.println(y);


        int x =10;
        int y=20;
        System.out.println(no(x,y));   //euclid algo
    }
    public static int no(int x , int y){
        if(y == 0) return x;
        return no(y,x%y);
    }
}
