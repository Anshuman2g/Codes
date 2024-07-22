package Inheritance;

public class boxprice extends boxweight{
    double price;
    boxprice(double l,double h,double w,double weight,double price){
        super(l,h,w,weight);
        this.price=price;
    }
    boxprice(){
        super();
        System.out.println("this boxprice");
    }
    boxprice(boxprice other){
        super(other);
        this.price=price;
    }
    public static void main(String[] args) {
        boxprice obj = new boxprice(3, 04, 8,50, 99);
         System.out.println(obj.h);

         boxprice obj2 = new boxprice();

 // three classes
 //first box second boxweight third boxprice
 // when calling default constcutor they would call the constructor above it parent class one 
 // so the ouput which this code would give use in order of the above parent class
    }
}
