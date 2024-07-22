package Interface.defaultInterface;

public class call implements def{

   public void gun(){
        System.out.println("this si gun");
    }
    public static void main(String[] args) {
        call obj = new call();
        obj.fun();  // calling default interface
        obj.gun();  // calling real interaface no body onw
    }
}
