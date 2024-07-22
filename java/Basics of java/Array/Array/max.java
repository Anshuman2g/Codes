package Array;

public class max {
    public static void main(String[] args) {
        int max[]={7,8,9,9,99};
            int count=0;
       for(int i=0;i<max.length;i++){
        if(max[i] > count ){
          count =max[i];
        }
      }
      System.out.println(count);
    }
    
}
