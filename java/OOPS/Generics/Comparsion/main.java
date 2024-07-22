package Generics.Comparsion;

public class main {
    public static void main(String[] args) {
        student kunal = new student(3, 666);
        student rahul = new student(1, 99);
        if(kunal.compareTo(rahul) < 0){
            System.out.println("rahul has more marks");
        }
        else{
            System.out.println("kunal has more marks");
        }
    }
}
