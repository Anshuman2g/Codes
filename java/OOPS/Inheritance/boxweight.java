package Inheritance;

import AccessModifers.A;

public class boxweight extends box{
    double weight;
   
    boxweight(){
        super();
        System.out.println("this is boxweight");
    }
    boxweight(double l,double h,double w,double weight){
        super(l,h,w); //super gonna call parent class(box) constructor
        this.weight=weight;
        // System.out.println(super.l);
    }
    //clone constructor
    boxweight(boxweight other){
        super(other); //calling a constructor 
        this.weight=other.weight;
    }
    public static void main(String[] args) {
        // boxweight  b = new boxweight(2, 4, 8, 10);
        // System.out.println(b.l + " "+b.h+" "+b.w+" "+b.weight); // these l,h,w 
        //all are properties of box parent classs and by using super we can call this
        //in our child class boxweight

        // boxweight  b2 = new boxweight(b);
        // System.out.println(b2.l + " "+ b2.h);

        // boxweight obj = new boxweight();
        // System.out.println(obj.l);

        
    }
}
