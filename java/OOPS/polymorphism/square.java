package polymorphism;

public class square extends shapes{
    @Override
    void area(){
        System.out.println("i am in square");
    }

     @Override
    public static  void greeting(){
        System.out.println("i am in square,greeting");
    }
}
