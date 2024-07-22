package Interface.extendInterface;

public class main implements B{
    public void fun(){     // b function 
        System.out.println("fun");
    }
    public void greet(){   // a function
        System.out.println("greet");
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.fun();
        obj.greet();
    }
    // here main is implemeting b meaning all the methods in b would be overriden 
    // since b extends a meaning b inherited all properteis of a 
    // now we have to override methods present in both A and B bec B extends A 
}
