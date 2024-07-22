public class species {
    //parent class
    int ht;
    int wt;
    int x;
    species(){ //default constructor
        System.out.println("this is default species constructor");
    }
    species(int x){
        this.x=x;
        System.out.println("this is numbered species constructor");
    }
   void sp(){ //function
        System.out.println("this is function species method");
    }
    public static void main(String[] args) {
        species obj = new species();
        obj.sp();
    }
}
