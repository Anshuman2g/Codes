package Interface;

public class main {
    public static void main(String[] args) {
        // car obj = new car();
        // obj.st();
        // obj.acc();
        // obj.brake();   //calling properties from a single class (interface )
        // obj.stop();

        // media obj2 = new car(); // here the ref var type is interface(media)
        // obj2.st();               // the only data is accessible that is inside media interaface
        // obj2.acc();
        // obj2.brake();
        // obj2.stop();

        // powerEngine eng = new powerEngine();
        // eng.st();
        // electricEngine eng2 = new electricEngine();
        // eng2.st();
        //two differnet classes for same interface

        nicecar car = new nicecar(null);
        car.st();
    }
}
