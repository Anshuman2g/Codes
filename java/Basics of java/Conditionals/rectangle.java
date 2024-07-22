import java.util.Scanner;
public class rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
               System.out.println("enter the value of l and w both for area and pereimeter");
        int l=sc.nextInt();
        int w=sc.nextInt();
       
        int area=l*w;
        int perimeter= 2*(l+w);
        if(area>perimeter){
            System.out.println("area is greater ");
        }
        else if(perimeter>area){
            System.out.println("perimeter is greater");
        }
        else{
        System.out.println("perimeter and area is equal");
        }


    }
}