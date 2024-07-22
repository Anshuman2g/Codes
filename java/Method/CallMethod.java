import java.util.*;
class Algebra{
    int add (int a, int b){
            int ans=a+b;
            return ans;
    }
}


public class CallMethod {

    public static void main(String[] args) {
        Algebra obj1= new Algebra();
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.print("the sum on numbers is");
       int ans= obj1.add(x,y);
       System.out.println(ans);

    // System.out.println(Math.sqrt(24));
    // System.out.println(Math.sqrt(16));  //here we have used a method math.sqrt to find square root of a no
                                          // math class is already available so no need to create it
    }
}
