package Kunal.Basics;

public class Wrapper {
    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
  //     int a=3;              //these are pass by value here 
    //     int b=4;               /primitive data type are pass by value
    //     swap(3,4);             // in case of an array it is object remember
    //     System.out.println(a + " " + b);   

    // Integer a =10;
    // Integer b=20;         // this is because of final keyword they are passed by value
    // swap(a,b);
    // System.out.println(a + " " + b);

    final int bonus=4;
     bonus=3;            // we used final now we cant change the value 
     System.out.println(bonus);
}                                

    

}    
