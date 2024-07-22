// import java.util.Scanner;
// public class divisible3_5{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%5==0 && num%3==0){
//             System.out.println("the given no is divisible by 3 and 5");
//         }
//         else{
//             System.out.println("the given no is  not divisible 3 amd 5");
//         }
//     }
// }
                    //    OR CONDITION

                    import java.util.Scanner;
public class divisible3_5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("the given no is divisible by 3 or 5");
        }
        else{
            System.out.println("the given no is not divisible");
        }
    }
}