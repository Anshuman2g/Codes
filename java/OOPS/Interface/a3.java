package Interface;

public class a3 implements a1,a2{
    @Override
    public void fun(){
        System.out.println("this is fun");
    }
    @Override
    public void gun(){
        System.out.println("this is gun");
    }
    @Override
    public void name(){
        System.out.println("this is name");
    }
    @Override
    public void rno(){
        System.out.println("this is rno");
    }
    // @Override
    public void itself(){       //own function of a3
        System.out.println("this is a3 own method");
    }
    a3(){

    }
    int x;
    a3(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        a3 obj = new a3();
        obj.fun();
        obj.gun();
        obj.itself();

        // a3 obj2 = new a3(2); // interface having its own properties alos
        // System.out.println(obj2.x); 

        // a2 obj = new a3(); // here the ref varibale type is a2 
        //  obj.name();       //only methods would be accessible that is inside a2
        //  obj.fun();        // as what we can access depends upon ref var type
        //  obj.gun();        // in overriding what methods would be accessible would
                           //depend on object type remember ok.....       
    }
}
// here we want to inherit properties of a1 and a2 so we can do this in interface
//ONLY IN INTERFACE BY implement KEYWORD , it would then inherit propeties of a1 and a2
