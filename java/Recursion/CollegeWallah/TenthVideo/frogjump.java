package CollegeWallah.TenthVideo;

public class frogjump {
static int min(int[]arr,int i){
    if(i == arr.length-1){
        return 0;
    }
   int op1= min(arr,i+1) + Math.abs(arr[i+1]-arr[i]);
    if( i == arr.length -2){
        return op1;
        // return Math.abs(arr[i+1]-arr[i]);
    }
   int op2 = min(arr,i+2) + Math.abs(arr[i+2]-arr[i]);
    return Math.min(op1,op2);
}
    public static void main(String[] args) {
      int[]arr={10,30,40,20};
      System.out.println(min(arr,0));
    }
}
