package Kunal.Basics;

import java.util.ArrayList;

class car{
    String name;
    int rank;
     float rating;
    //  void greeting(){
    //    System.out.println("the name is now " + this.name);
    //  } 
    //  void changename(String newname){
    //     name=newname;
    //  }
     car(){
        this.name="ferrari";
        this.rank=1;               //default construcotr 
        this.rating=99;
     }
     car(String name,int rank,float rating){
        this.name=name;
        this.rank=rank;                   //parameterized constructor
        this.rating=rating;
     }
}
public class Constructor {
    public static void main(String[] args) {
        car c = new car();
        System.out.println(c.name); 
        System.out.println(c.rank);       //calling defalut constructor 
        System.out.println(c.rating);
        

        car c2 = new car("ram",1,22.4f);  //passing value
        System.out.println(c2.name); 
        System.out.println(c2.rank);        //calling parametrized construtor
        System.out.println(c2.rating);
        
    //     c.changename("shoe lover");
    //    c.greeting();
    }
}
