
import java.util.Scanner;
class uniquerev {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
   
       
        for(int a=0;a<arr.length;a++){
            for(int b=a+1;b<arr.length;b++){
                if( arr[a] == arr[b]){
                    arr[a]=-1;
                    arr[b]=-1;
                }
            }
        }
        int ans=0;
        for(int a=0;a<arr.length;a++){
            if(arr[a] !=-1){
                ans=arr[a];
            }
        }
        System.out.println(ans);

    }
}
