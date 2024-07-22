package Inheritance;

public class A3 extends A2{
        int funno;
    A3(String name, int rno, int ht,int funno) {
        super(name, rno, ht);
        this.funno=funno;
    }
    public static void main(String[] args) {
        A3 obj = new A3("raaaam", 1, 40,99);
       obj.set(); 


       A obj2 = new A3("mahadevvv", 30, 30, 70);
       System.out.println(obj2.name + " " + obj2.rno + "  "+ obj2.ht + " " + obj2.funno);
       //see here ref var type is A the super class the only member accessible would be that would be present in A 
       A2 obj3 = new A3("mahadevvv", 30, 30, 70);
       System.out.println(obj3.name + " " + obj3.rno + "  "+ obj3.ht + " " + obj3.funno);
       //see here ref varibale type is A2 only member accessible would be that would be presnt in A2
    }
}
