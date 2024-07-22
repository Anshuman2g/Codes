package Abstract;

public abstract class parent {
    int age;
    parent (int age){
        this.age=age; //constructor of parent class
    }
   
    abstract void carrer(String name);
    abstract void partner(String name ,int age);
    abstract void love();

    static void fun(){
        System.out.println("static method can be created in abstract classes");
    }
}
//parent class would have abstract method and would have to use abstract
//now all the child classes would have to override these methods
