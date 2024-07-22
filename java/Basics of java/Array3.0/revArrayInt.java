import java.util.Scanner;
public class revArrayInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        int x=0;
        int y=arr.length-1;
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;

        }
        for(int z=0;z<arr.length;z++){
            System.out.println(arr[z]);
        }


    }
}
