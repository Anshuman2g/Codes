package Array;

public class searchbinary {
    public static void main(String[] args) {
    int[] find={1,2,34,4,5,6,6,6};
    int x=6;
    int ans=-1;
    for(int i=0;i<find.length;i++){
        if(find[i] ==x){
            ans=i;

        }
    }
    System.out.println(ans);
 

    }
    
}
