// import java.util.Scanner;
// public class greatestnu{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a,b,c;
//         System.out.println("enter the value of a");
//         a =sc.nextInt();
//            System.out.println("enter the value of b");
//          b =sc.nextInt();
//             System.out.println("enter the value of c");
//           c =sc.nextInt();
//           if(a>b && a>c){
//             System.out.println(a+ "is largest");
//           }
//            if(b>c && b>a){
//             System.out.println(b+ "is largest");
//           }
//            if(c>a && c>b){
//             System.out.println(c+ "is largest");
//           }
//               }
// }


                        //    ELSE IF
                        import java.util.Scanner;
public class greatestnu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a");
        a =sc.nextInt();
           System.out.println("enter the value of b");
         b =sc.nextInt();
            System.out.println("enter the value of c");
          c =sc.nextInt();
          if(a>b && a>c){
            System.out.println(a+ "is largest");
          }
          else if(b>c && b>a){
            System.out.println(b+ "is largest");
          }
           else{
            System.out.println(c+ "is largest");
          }
              }
}