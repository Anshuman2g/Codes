package polymorphism;

public class methodOverloading {
    void fun(){
        System.out.println("fun1");
    }    
    void fun(int x){
        System.out.println("number fun");
    }
    void fun(String name){
        System.out.println("String fun");
    }
    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        obj.fun("ram");
    }
    //one class having same function but with differnt return type 
    //why this is called compile time polymorphism?
    //becuase when we would call the function the compiler would see there are a lot
    // of fucntion with the same name so the no of arguments passed and type of 
    //argument passed would tell compiler to call this function
    //this all happens during compile time so called compile time polymorphism
}
