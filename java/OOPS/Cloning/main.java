package Cloning;

import java.util.Arrays;

public class main {
   public static void main(String[] args) throws CloneNotSupportedException{
    humann kunal = new humann(3,"ram");
    // humann twin = new humann(obj);
     
    humann twin = (humann)kunal.clone();
    // System.out.println(twin.age);
    // System.out.println(twin.name);
    System.out.println(Arrays.toString(twin.arr));
    // twin.arr[0]=100;
    // System.out.println(Arrays.toString(kunal.arr)); // shallow copy change in copied object reflected in real also

    twin.arr[0]=100;
    System.out.println(Arrays.toString(kunal.arr));  // deep copy did not change now
   } 
}
