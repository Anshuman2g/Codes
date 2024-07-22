package Inheritance;

public class box {
    double l;
    double h;
    double w;
    box(){  //default
        this.h=-1;
        this.l=-1;
        this.w=-1;
        System.out.println("this is the box");
    }
    box(double side){ //cube 
        l=side;
        h=side;
        w=side;
    }
    box(double l,double h,double w){  //3 values passed
        this.l=l;
        this.h=h;
        this.w=w;
    }
    box(box other){
     this.l=other.l;
     this.h=other.h;
     this.w=other.w;
     System.out.println("this is box");
    }
    
    public void fun(){
        System.out.println("this is the box");
    }
}
