import java.util.Scanner;
public class forloop_n_number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for( int num=1;num<n;num++){
            System.out.println(num);
        }
    }
    
}
