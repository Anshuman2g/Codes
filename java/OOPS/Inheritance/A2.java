package Inheritance;

public class A2 extends A{
    int ht;
    A2(String name,int rno,int ht){
        super(name, rno); 
        System.out.println(super.rno);
    } 
   public void set(){
        System.out.println("this is set");
    }
    public static void main(String[] args) {
        A2 obj = new A2("ram", 100, 900);
        System.out.println(obj.name + " " + obj.ht);
        obj.fun();

        // A ob = new A("shiv",231);
        // System.out.println(ob.name + " " + ob.rno );

        // A ob2 = new A2("mahadev", 100,4);  // ob2 type parent class
        // System.out.println(ob2.name + " " + " " + ob2. rno);

        //   ob3 = new A("mahadev", 100);           //ob3 type child class
        // System.out.println(ob3.name + " " + " " + ob3. rno); //cant intialize child value
    }                                                     //giving errors
}                           
