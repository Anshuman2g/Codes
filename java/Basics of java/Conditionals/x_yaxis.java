import java.util.Scanner;
public class x_yaxis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
        int a=sc.nextInt();
         System.out.println("enter the b");
        int b=sc.nextInt();
        if(a == 0 && b ==0){
            System.out.println("the no lies on origin");
        }
        
          else if ( a == 0){
                System.out.println("the no lies on y axis");
            }
            else if (b == 0){
                System.out.println("the no lies on x axis");
            }

        
        else{
            System.out.println("it neither lies");
        }
        


    }

}