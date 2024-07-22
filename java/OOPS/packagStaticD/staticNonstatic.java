package packagStaticD;

public class staticNonstatic {
    public static void main(String[] args) {
        
    }
    // public static void fun(){
    //     greeting();
    // }       // here we are calling non static inside static which would give ERROR

    // void greeting(){
    //     System.out.println("hello");
    // }

    public static void fun(){
        staticNonstatic obj = new staticNonstatic(); // here we created a object of class staticNonstaic
       obj.greeting();              //now we can call non static inside static
    }   


    void greeting(){
        System.out.println("hello");
    }
}
