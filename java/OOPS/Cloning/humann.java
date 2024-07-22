package Cloning;

public class humann implements Cloneable{
    int age;
    String name;
    int[]arr;
  public humann (int age,String name){
      this.age=age;
      this.name=name;
      this.arr=new int[]{3,4,5,67};
    }
   public humann (humann other){
        this.age=other.age;
        this.name=other.name;
    }
    //SHALLOW COPY
    // public Object clone() throws CloneNotSupportedException{
    //     //this is shallow copy
    //     return super.clone();
    // }

    //DEEP COPY
    public Object clone() throws CloneNotSupportedException{
           humann twin = (humann) super.clone(); // this is shallow copy
           //make a deep copy
           twin.arr=new int[twin.arr.length];
           for(int i=0;i<twin.arr.length;i++){
            twin.arr[i]=this.arr[i];
           }
           return twin;
        }
}

