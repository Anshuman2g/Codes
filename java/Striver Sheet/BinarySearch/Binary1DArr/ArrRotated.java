package Binary1DArr;
public class ArrRotated {
    static int rot(int[]arr){
        int st=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int rot=0;

        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[st]<=arr[med]){
                if(arr[st]<ans){
                    rot=st;
                    ans=arr[st];
                }
                st=med+1;
            }
            else if(arr[med]<=arr[end]){
                if(arr[med]<ans){
                    rot=med;
                    ans=arr[med];
                    end=med-1;
                }
            }
        }
        return rot;
    }
    public static void main(String[] args) {
        int[]arr={3,4,5,1,2};
        System.out.println(rot(arr));
    }
}
