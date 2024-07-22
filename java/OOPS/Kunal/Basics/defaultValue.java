package Kunal.Basics;
class Student{
    String name;
    int rno;
    float marks;
}
public class defaultValue{
    public static void main(String[] args) {
       Student s2 = new Student();       //this is a default constructor
    //    s2.name="unknown";
    //    s2.rno=44;
       System.out.println(s2.name);
       System.out.println(s2.rno);
       System.out.println(s2.marks);
    }
}
