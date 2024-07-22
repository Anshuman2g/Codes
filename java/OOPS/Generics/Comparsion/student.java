package Generics.Comparsion;

public class student implements Comparable<student>{
    int rno;
    int marks;
    public student(int rno,int marks){
        this.rno=rno;
        this.marks=marks;
    }
    public int compareTo(student o){
       int diff=  this.marks - o.marks;
       return diff;
    }   
    // if diff == 0 both are equal
    // if diff<0 o is bigger
    // if diff>0 o is smaller
}
