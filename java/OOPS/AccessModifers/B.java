package AccessModifers;

public class B extends A{
    public B(int n,String name){
           super(n,name);
    }
    public static void main(String[] args) {
        B obj = new B(3,"ram");  
        // System.out.println(obj.n);


        // System.out.println(obj instanceof A); // instance operator

        System.out.println(obj.getClass()); // get class method 
    }
}
