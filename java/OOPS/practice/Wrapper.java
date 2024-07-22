package practice;

public class Wrapper {
    public static void main(String[] args) {
         Integer a= 33;
         a=454;
        Integer b =44;
        swap(a,b);
        System.out.println(a + " "+ b);

    }
    public static void swap(int a , int b){
        int temp= a;
         a= b;
         b=temp;
      
    }
}
