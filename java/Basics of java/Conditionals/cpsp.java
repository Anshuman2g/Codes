import java.util.Scanner;
public class cpsp{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
          System.out.println("enter cost price");
        int costprice = sc.nextInt();
          System.out.println("enter selling price");
        int sellingprice = sc.nextInt();
        if(sellingprice>costprice){
            System.out.println("your profit booked is");
            System.out.println(sellingprice-costprice);
        }
        if(costprice>sellingprice){
            System.out.println("your loss booked is");
            System.out.println(costprice-sellingprice);
        }
    }
}