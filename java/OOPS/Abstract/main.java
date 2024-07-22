package Abstract;

public class main {
    public static void main(String[] args) {
        son obj = new son(3);
        // obj.carrer("ram");
        // obj.partner("shiv", 111110);    //calling abstract methods
        // obj.love();
 
        // parent obj2 = new parent(); //
        //cannot create object of abstract class
        // if object cannot be created then constructor can also not be created

        // parent.fun();
        //calling a static(not related to obj) method that is inside a abstract class
        //(abstract method do not also have a object)
        //so we can make static method inside it and simply call it

         // abstract parent(); // abstract construtor not allowed
         //abstract static void fun2()// abstract static method not allowed
    }
}
