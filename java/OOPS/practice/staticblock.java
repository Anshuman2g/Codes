package practice;

public class staticblock {
 static int a =1;
 static int b=2;
     static {
      System.out.println("run only once");
     b+=2;
     }   
    public static void main(String[] args) {
      System.out.println(staticblock.a +" "+ staticblock.b);
      b+=5;
      System.out.println(staticblock.a + " "+staticblock.b);
    }
}
