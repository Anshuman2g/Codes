package Inheritance;
import AccessModifers.A;
public class accessModSubClass extends A{
    public accessModSubClass(int n,String name){
       super(n,name);
    }
    public static void main(String[] args) {
        accessModSubClass obj = new accessModSubClass(33,"ram");
        System.out.println(obj.n);
    }
}
// this class is a subclass of accessmodifers packages A class
// here n is a protected modifer
// we can use n outside the package meaning another package only if
// that class is a subclass of the varibale class
//PROTECTED MODIFIERS
