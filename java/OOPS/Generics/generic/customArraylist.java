package Generics.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class customArraylist {
    private static int DEFAULT_SIZE=10;// fixed size memory efficient
    private int[]data = new int[DEFAULT_SIZE]; // we dont want people to change the working of this array directly like how this array works ,we would provie fuctions via which they can do their operations and use it   
    private int size=0;  //internal size 
 
    public void add(int num){       //ls.add -> that function we are creating here
         if(isFull()){
            resize();
         }
         data[size++]=num;         
    }
    private void resize(){
       int[]temp = new int[data.length * 2];
       for(int i=0;i<data.length;i++){
        temp[i]=data[i];
       }
       data = temp; // the data array was pointing to itself now its pointing to temp 
    }
    
    private boolean isFull(){         // how do we know kb full hoga jb 
          return data.length == size;  // we comparing these two as length is a own property of array it would give us the size of that array(the size we gave her like DEFAULT SIZE =10) while size determines the count  elments we are inserting and incrementing its count and when size count matches the data.length meaning the array is full 
    }
    public int remove(){
        int remove = data[--size]; // here we want to remove a item in arraylist so we say ls.remove(3) at 3 index remove it so return type a integer and we doing -- size basically to move one behing one when adding another element it would basically override it then
        return remove;  
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    public String toString(){
        return Arrays.toString(data) + " "+size;
    }
    public static void main(String[] args) {
       customArraylist ls = new customArraylist();
    //    ls.add(3); 
    //    ls.add(4);
    //    ls.add(3);
      for(int i=0;i<14;i++)
      ls.add(2*i);
       System.out.println(ls);
    }
}
