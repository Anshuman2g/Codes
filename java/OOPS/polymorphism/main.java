package polymorphism;

public class main {
    public static void main(String[] args) {
        // shapes obj = new shapes();
        // // square obj2 = new square();
        // triangle obj3 = new triangle();
        // shapes obj4 = new triangle();// ref var type superclass and object type subclass
        // obj4.area();


        //calling a static method
        //here square method would not be called but the parent method would be called
        // shapes obj2 = new square();
        // obj2.greeting();

        shapes obj3 = new square(); 
        obj3.greeting();   // ref var type parent class
        // obj type child class
        // method to be called depends upon obj type but since this method(greeting function) is static
        //it would call here parent class 
    }
}
