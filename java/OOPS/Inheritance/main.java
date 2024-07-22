package Inheritance;

import AccessModifers.A;

public class main {
    public static void main(String[] args) {
        box b= new box(3);
        box b2 = new box(b); //here passing b in b2 clone constructor made in box.java
        // System.out.println(b2.h +" "+b2.l+ " "+b2.w);

        boxweight b1 = new boxweight(22,33,44,55);
        // System.out.println(b1.l + " "+b1.h+" "+b1.w+" "+b1.weight);
        // super used here boxweight inhereting properties of box

        // box b = new boxweight(9,8,7,6);
        // // System.out.println(b.weight);//here ref var type is parent class (box)
        // // and object is of child class
        // // and only the variables or method present in box are accessible
        // System.out.println(b);

        // now opposite of above 
        // ref variable type child class and object if parent class
        // ab parent ka object bana and jo properties ab parent ke class constructor mai
        //hai woh sird uski hogi kioki use niche ka koi ata ptat nhi hai
        //BUT JB CHILD OBJECT THA USKE CLASS COMPARATOR KE PASS PARENT KI SB PROPERTIES THI
        //SO THBHI YH VALID HAI PR PARENT JB OBJECT HOGA TB
        // boxweight x = new box(2,3,4);

    //    access a = new access(3, null);
    //    System.out.println(a.n); // this object is of accessmodifier package
    // this n variable cant be accessed because its default
    //default modifier means not accessible from any other package

    A obj = new A(3,"ram");
    System.out.println(obj.n);
   // this object is of accessmodifier package
   // this n variable cant be accessed because its protected
   // protected cant be accessed in differnet package and main class(not subclass)
   // but remember can be accessed in differnet package and that varibale subclas
   // like accessmosSubClass example here
 
    }
}
