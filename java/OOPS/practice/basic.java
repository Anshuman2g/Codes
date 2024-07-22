package practice;

import java.util.Arrays;

class student{
    int rno;
    String name;
    float marks;
    student(){}

    student(int rno,String name,float marks){
      this.rno=rno;
      this.marks=marks;
      this.name=name;
    }
    student(student other){      //--> studnet kunal
        this.rno=other.rno;     // this --> m        other   -->k 
        this.marks=other.marks;  // m.marks = k.marks
        this.name=other.name;    //m.name = k.name
    }
    student(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object destroyed");
    }
}
public class basic {
    public static void main(String[] args) {
        // student []s1 = new student[5]; // this is an array of student data type like there are int string array this is student data type array
        //  System.out.println(Arrays.toString(s1)); // its each element have would have three properties         

       
      student k = new student(1,"kk",111f); 
      student m = new student(k);
       System.out.println(m.marks);

       student r1;//declaring kr rhe hai 
       for(int i=0;i<100000000;i++){
        r1 = new student("destroy");
       }
    }
}
