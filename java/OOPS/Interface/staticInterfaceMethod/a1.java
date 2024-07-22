package Interface.staticInterfaceMethod;

public interface a1 {
    public static void fun(){
        System.out.println("this is static method which sould have a body");
    }
    public static void game(){
        System.out.println("this is a static methods");
    }
    public static void main(String[] args) {
        a1.fun();
        a1.game();
    }
    //this is static interface methods 
    // static not related to object
    //interface not related to object 
    //so we can call this function directly via class name but remember
    //static funtion need to always have a body as they cant be overridden 
    //if overriden then in subclass we can enter something inside their body
    //since not overriden because of static so have a body
}
