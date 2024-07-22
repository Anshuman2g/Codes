package SecondVideo;

public class Concept {
    public static void no(int n){
        if( n == 0) return;
        System.out.println(n);
        //  no(n--); //post decrement
        no(n-1); // --n
    } 
    public static void main(String[] args) {
       no(5);
    }
}
