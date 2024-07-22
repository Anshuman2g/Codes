// import java.util.Scanner;
// public class nested_ifelse{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the vaue of num");
//         int num=sc.nextInt();
//         if(num%5 == 0){
//             if(num%3 == 0){
//                 System.out.println("the num is divisible by 3 and 5");
//             }
//             else{
//                 System.out.println("num is not divisible");
//             }
//         }
//         else{
//             System.out.println("num is not divisible");
//         }
        

//     }
// }

                                //  OR CONDITION

// import java.util.Scanner;
// public class nested_ifelse{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the vaue of num");
//         int num=sc.nextInt();
      
// if(num%3 == 0 || num%5 ==0){
//     if(num%15 != 0){
//         System.out.println("the num is divisible by 3 or 5 but not 15");
//     }
    
//     else{
//         System.out.println("no not divisibel");
//     }
//     }
//     else{
//         System.out.println("no not divisible");
//     }
    


    
//     }
// }

                    //   using only if else 


import java.util.Scanner;
public class nested_ifelse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
        int n=sc.nextInt();
        if((n%5 == 0 || n%3== 0) && n%15 !=0){
            System.out.println("the no is divisible  by 3 or 5 but not by 15");
        }
        else{
            System.out.println("not matching required condition");
        }
        
        
    }
}




