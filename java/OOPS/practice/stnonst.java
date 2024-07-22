package practice;

public class stnonst {
    void hlo(){
        System.out.println("this hlo is a non static method");
    }
    static void bye(){
        System.out.println("this is a static method");
    }
    public static void main(String[] args) {
        bye();//inside a static we can call a static method
        hlo();//but cant call a non static method insdie a static 
        // to calll it we need to create a obejct first
        stnonst obj = new stnonst();
        obj.hlo(); //now we created a object we can call a nonstatic method inside a 
        //static method 
    }
}
