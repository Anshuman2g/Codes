// import java.util.Scanner;
// public class input{
//     public static void main(String[] args){
//         Scanner sc =  new Scanner(System.in);
//         // area of circle
//         // a = pi r r
//         double pi =3.14;
//         int radius= sc.nextInt();
//         double area = pi * radius * radius;
//         System.out.println(area);555

        
//     }
// }


import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius");
        double pi =3.14;
        double radius = sc.nextDouble();
        double area = pi * radius * radius;
        // System.out.print("the area of circle is ");
        // System.out.println(area);

        // or

            System.out.println("ther area of circle is" +area);

    }
}