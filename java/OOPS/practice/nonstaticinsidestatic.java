package practice;

import PackagB.greeting.greeting;

public class nonstaticinsidestatic {
    void greeting(){
        System.out.print("this is non static method");
    }
    static void fun(){
        System.out.print("this is a static method");
    }
    public static void main(String[] args) {
        nonstaticinsidestatic obj = new nonstaticinsidestatic();
        obj.greeting();
        System.out.println();
        fun();
    }

    // we can have a static method inside nonstatic 
    // while we cant have a non static inside static but by creating the instance of the class we can then do it 
    // static do not relates to instances  they relate to object they are also called by class name while non static relate to instances
}
