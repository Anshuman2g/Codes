package Array1;
public class SumArray {
    public static void main(String[] args) {
        int[]arr=new int[4];
        arr[0]=1;
        arr[1]=5;
        arr[3]=4;
        // System.out.println(arr[0]+arr[1]+arr[2]);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
