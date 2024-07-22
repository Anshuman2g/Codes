import java.util.Scanner;
class pairSumrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
   
        int x=10;
        int count=0;
        for(int a=0;a<arr.length;a++){
            for(int b=a+1;b<arr.length;b++){
                if(x == arr[a] + arr[b]){
                 count++;
                }
            }
        }
        System.out.println(count);
        
    }
}