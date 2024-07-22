package Array;

public class bool {
    public static void main(String[] args) {
        int[]arr={1,3,5,6,7};
        boolean check =true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                check =false;
                break;
            }
        }
        System.out.println(check);
    }
}

