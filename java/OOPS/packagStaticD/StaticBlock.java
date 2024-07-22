package packagStaticD;

public class StaticBlock {
    static int a=3;
    static int b;
    static{
        System.out.println("we are in static block");
        b=a*3;       // this is the static block where we can initialize our value
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock(); // for it static block would run
        System.out.println(StaticBlock.a + " " + StaticBlock.b); // as it is first object

        b+=2;
        System.out.println("adding 3 to it" + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock(); // this would not be called as 
        System.out.println(StaticBlock.a + " " + StaticBlock.b);; // static  are only called once
    }            // you can see the sout statement in static block would not be printed
}
