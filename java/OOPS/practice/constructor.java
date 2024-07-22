package practice;
 public class constructor {
    String name;
     int rno;
    constructor(){

    }
    constructor(String name,int rno){
      this.name=name;
      this.rno=rno;
    }
    constructor(constructor other){
        this.name=other.name;
        this.rno=other.rno;
    }
    public static void main(String[] args) {
        // constructor obj = new constructor();
        // obj.name="ram";
        // obj.rno=434;

        // constructor obj2 = new constructor();
        // obj2.name="rm";
        // obj2.rno=999;

       final constructor obj3 = new constructor();
        obj3.name="shiv";
        System.out.println(obj3.rno);
        //    obj3 = new constructor("ram",343);
         
        //    constructor obj4 = new constructor(obj3);
        //    System.out.println(obj4.name);
    }
}
