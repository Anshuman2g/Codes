package Kunal.Basics;

import java.util.Arrays;

class student1{
    String name;
    int rno;
    float marks;
    
}
public class basic {
    public static void main(String[] args) {
        // student1[]s = new student1[5];
        // System.out.println(Arrays.toString(s));  //checking default value here

       student1 s2 = new student1();
        s2.name="ha";
        s2.rno=55;
        s2.marks=159.4f;
        System.out.println(s2.name); //just assigning value to ref var and printing it
        System.out.println(s2.rno);
        System.out.println(s2.marks);
    }
}
