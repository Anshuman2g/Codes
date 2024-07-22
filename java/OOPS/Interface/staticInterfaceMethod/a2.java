package Interface.staticInterfaceMethod;

public class a2 implements a1{
    @Override
    public static void fun(){   // this is static method this is not goona get override
        System.out.println("this also not gonna get override"); // its already in a1
    }
    @Override
    public static void gun(){ 
        System.out.println("this also not gonna get override");
    }
    public static void main(String[] args) {
       a1.fun();
    }
    // static method can be only used in the class it is declared and initialilzed
    //but it cant be overriden as static not obejct related so no overriden happens
}
