package packagStaticD;




class Test{       
    static String name;      
    public Test(String name){   // here we declared a variable as static now it means 
         Test.name=name;     // this varibale doenst depend on object
     }                 //when value is passed to it , it would print last final value
 }                     // as object by object passing value not depending on object so the last value would be printed 
public class InnerClasses {
    static class ts{
              // this is a inner class 
              // where we use static depends if we use static on inner class it means
              // it is not dependent on object of above class but its dependent on object of its class
              // now for above class test if we use static there it means its not 
              //dependent on object of ITSELF class now 
     }
   
    public static void main(String[] args) {
        Test t1 = new Test("ram");
        Test t2 = new Test("shiv");
        System.out.println(Test.name);
        System.out.println(Test.name);
    }
}
