import java.util.Scanner;
public class div3not5{
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5 ==0 && num%3 !=0){
            System.out.println("div by 5 and not by 3");
        }
        else{
            System.out.println("div by 3 and 5 both");
        }
      
    }
}


// import java.util.Scanner;
// public class div3not5{
// public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%5 ==0 || num%3 ==0){
//             System.out.println("div by 5 or 3");
//         }
//         else{
//             System.out.println("not div");
//         }
      
//     }
// }