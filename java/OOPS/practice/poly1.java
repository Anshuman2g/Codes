package practice;

 public class poly1 {
       public void fun(){
        System.out.println("this is default poly1 function");
     }
     public static void fun(String s){
        System.out.println("this is String function");
     }
     public  void fun(int x){     // function overloading
            System.out.println("this is int function");
     }

     String name;
     int rno;
     poly1(){

     }
     poly1(String name){
        this.name=name;        // constructor overloading
     }
     poly1(int rno){
        this.rno=rno;
     }
     poly1(String name,int rno){
        this.name=name;
        this.rno=rno;
     }
     public void hlo(){
        System.out.println("this is hlo from poly1");
     }
       public static void main(String[] args) {
        poly1 obj = new poly1("ram",4);
        System.out.println(obj.rno + " " + obj.name);  //COMPILE TIME POLYMORPHISM
        obj.fun("ram");
   
       }
}
