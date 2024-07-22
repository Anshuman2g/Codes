package CollegeWallah.SecondVid;

public class factorial {
    public static int no(int x){
        if(x == 0)  return 1; 
          int val =x;
          int m= no(x-1);
          return val*m;

    }
    public static void main(String[] args) {
        int n =4;
       int x = no(n);
       System.out.println(x);
    }
}
