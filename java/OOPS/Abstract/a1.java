package Abstract;

public abstract class a1 {
         abstract void fun(); 
         abstract void no(int x);
         abstract void name(String name);  //abstract functions jinki  koi body nhi hai
// -----------------------------------------------------------------------------------------------------------
//    public final abstract class a1
// we cant have a abstract final class as final means we cant change value 
//    so no Inheritance then no inheritance means no methodOverloading and abstract method
//    working on methodOverloading only , so we cant use it then
// ---------------------------------------------------------------------------------------------         
         public static void hey(){
            System.out.println("this is static method inside a abstract class");
         }
        //  we can create static method inside inside a abstract class as as static are
        //  not related to object and object also do not have a body so we cant create its
        //  object so its also not related to object so simply we can call the static method then
// -------------------------------------------------------------------------------------------
        //  static abstract void hlo();
        // we cant create static abstract method as abstract method need to be overriden
        // by subclass methods and overriding depends on object
        //while static have no relation with object 
        //so we CANT CREATE static abstract method 
// -------------------------------------------------------------------------------------------------        
         public static void main(String[] args) {
            // a1 obj = new a1();
            // obj.fun();   // cannot create object of abstaract classes as they do not have a body
            // and when object is created and a call to function would be made 
            // then what would it display if the function have no body 

            // if object cant be created  then how can we create constructor
            //so constructor is also not allowed

         }
}
