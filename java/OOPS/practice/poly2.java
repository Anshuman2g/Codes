package practice;

public class poly2 extends poly1{
    @Override
    public void fun(){     // method overriding 
        // same function presnt in both which to call would now depend on type of object
        System.out.println("this is poly2 function");
    }
    @Override
    public void hlo(){
        System.out.println("is this gonna override ");
    }

    public static void fun(String s){    // this is a static method one prenst in poly1 also static cant be overriden
        System.out.println("is this gonna get call");
    }
    public static void main(String[] args) {
        poly1 obj = new poly2(); // here ref var type is parent while object type is child so in overriding the 
        obj.fun();              // the method we can access depends upon object type

       obj.hlo();
        
       obj.fun("ram");//static method prinitng here
    }
}
