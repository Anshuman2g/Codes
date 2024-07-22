import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int ans = sum(20,30);
        System.out.println(ans);
    }

    static int sum(int a, int b)
{
    int sum1 =a+b;
    return sum1;
}    
}
