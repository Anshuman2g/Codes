package Array1;
public class SearchElement {
    public static void main(String[] args) {
         int[]arr=new int[3];
         arr[0]=4;
         arr[1]=4;
         arr[2]=8;
         int x=4;
         int ans=-1;
         for(int i=0;i<arr.length;i++){
             if (x == arr[i]){
                ans=i;
                break;
             }
         }
         System.out.println("found the value of 4 at" +ans+"this index");
}
}
// this is linear search question