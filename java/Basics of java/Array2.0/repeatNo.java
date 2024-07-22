import java.util.Scanner;
public class repeatNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       
        int count=0;
        int flag=0;
        for(int a=0;a<arr.length;a++){
            for(int b=0;b<arr.length;b++){
                if(arr[a] == arr[b]){
                    count =arr[a];
                    flag=1;
                    break;
                }
                if(flag ==1){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
    

