package Xprac;

public class StockSpann {
    public static void main(String[] args) {
        int[]arr={10, 4 ,5 ,90 ,120 ,80};
        int[]res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int cn=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<=arr[i]){
                    cn++;
                }
                else{
                    break;
                }
            }
            res[i]=cn;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
