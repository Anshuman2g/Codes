package Generics.Comparsion;

public class a1 implements Comparable<a1>{ // used implement Comparable <a1> a1 is the type for which we want to compare
    int rno;
    int marks;
    a1(int rno,int marks){
        this.rno = rno;    // ek class bani usme instance varibale hai and uska comparator
        this.marks = marks;
    }
    public int compareTo(a1 o){// compareto function used here 
       int diff = this.marks - o.marks;
       return diff;
    }
    public static void main(String[] args) {
        a1 ram = new a1(2,44);
        a1 sham = new a1(1,99);   // us class ke do object bnaye ab umhe compare kran hai
                                            // konda bada hai kis basis pr 
                                            // we would do it with help of comaparable
        if(ram.compareTo(sham) >0){
            System.out.println("ram is g");
        }
        else{
            System.out.println("sham is g");
        }
    }
}
