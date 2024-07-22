public class human extends species{
    void hm(){ //for this function in main, object is created so we need not to use static here as now we have object in main and we can call it 
        super.sp();// this function is in species class and its also non static so hm would say to use its object and then we can print both of them
        System.out.println("i am human"); 
    }
    static void fun(){        //here we need to use static bec it does not have its object and main is static and inside static only static one are called
        System.out.println("would it be called");
    }
    human(){
        super(3); // here the constructor having one parameter would be called
        System.out.println("this is human constuctor"); // here first the construcotr of its parent immedate class would be called 
    }
    public static void main(String[] args) {
        human obj = new human();
        System.out.println(obj.x);
        obj.ht=33;
        obj.wt=99;
        obj.hm(); // calling hm function
        fun();
        obj.x=99;
        System.out.println(obj.x);
         
    }
}
