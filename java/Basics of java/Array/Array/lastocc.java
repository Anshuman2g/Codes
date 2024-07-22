package Array;
import java.util.Scanner;
public class lastocc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        
        System.out.println("enter the elements of array");
        int ar[]=new int[n];
       for(int i=0;i<ar.length;i++){
        ar[i]=sc.nextInt();
       }

       System.out.println("enter the number to be found");
    
        int x=sc.nextInt();
        int ans=-1;
        for(int i=0;i<ar.length;i++){
            if(x == ar[i]){
              ans = i;
            }
        }
        System.out.println(ans);
    }
    
}
