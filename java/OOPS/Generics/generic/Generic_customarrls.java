package Generics.generic;

import java.util.Arrays;

public class Generic_customarrls <T>{

    private static int DEFAULT_SIZE=10;
    private Object []data = new Object[DEFAULT_SIZE]; 
    private int size=0;  
 
    public void add(T num){    
         if(isFull()){
            resize();
         }
         data[size++]=num;         
    }
    private void resize(){
       Object[]temp = new Object[data.length * 2];
       for(int i=0;i<data.length;i++){
        temp[i]=data[i];
       }
       data = temp; 
    }
    private boolean isFull(){         
          return data.length == size; 
    }
    public T remove(){
        T remove = (T)data[--size]; 
        return remove;
    }
    public T get(int index){
        return(T) data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    }

    public String toString(){
        return Arrays.toString(data) + " "+size;
    }
    public static void main(String[] args) {
        Generic_customarrls<Integer> ls3 = new Generic_customarrls<>();
        ls3.add(434);
        ls3.add(434);
        ls3.add(434);
        
        ls3.add("cant add any string");
       System.out.println(ls3);
    }
}


