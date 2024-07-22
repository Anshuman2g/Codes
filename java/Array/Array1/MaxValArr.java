package Array1;
public class MaxValArr {
    public static void main(String[] args) {
        int[]arr=new int[3];
        arr[0]=1;
        arr[1]=5;
        arr[2]=3;
        int max=0;
        for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            System.out.println(max);

    }
    
}
