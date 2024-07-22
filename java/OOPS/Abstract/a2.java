package Abstract;

public class a2 extends a1{
    public  void fun(){
      System.out.println("this is fum");
     }
     public void no(int x){
        System.out.println("this is no");
     }
    public  void name(String name){
        System.out.println("this is ram");
     }

     public static void main(String[] args) {
        a2 obj = new a2();
        obj.fun();
        obj.no(4);
        obj.name("ram");
        a1.hey(); // calling a static method with class name as static not realted with 
        //object so we have to call them with class name
     }
}
