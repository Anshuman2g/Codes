package BinaryOnAnswer;

public class RoseGardenMinday {

    static int logic(int[]arr,int r,int bq,int i){
        int count=0;
        int noOfbq=0;
        for(int m=0;m<arr.length;m++){
            if(arr[m]<=i){
                count++;
            }
            else{
                noOfbq+=Math.floor((double)count/r);
                count=0;
            }
        }
        noOfbq+=(count/r);
     if(noOfbq>=bq){
        return i;
     }
     return -1;
    }

    static int min(int[]arr,int r,int bq){
        if(r*bq>arr.length){
            return -1;
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           max=Math.max(arr[i],max);
           min=Math.min(arr[i],min);
        }

        for(int i=min;i<=max;i++){
              if (logic(arr,r,bq,i) != -1){
                return i;
              }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = { 1, 2, 1, 2, 7, 2, 2, 3, 1 };
       int r=3;
       int bq=2;
       System.out.println(min(arr,r,bq));
    }
}
//https://www.codingninjas.com/studio/problems/rose-garden_2248080?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=SUBMISSION 