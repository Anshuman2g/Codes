package firstVideo;

public class BinarySearch {
    public static int search(int[]arr,int x,int st,int end){
            if(st > end) return -1;
            int med =st+(end-st)/2;
            if(arr[med]==x) return med;
            else if(arr[med]<x){
            return search(arr, x, med+1, end);
            }
            return search(arr, x, st, med-1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int x=6;
        int st=0;
        int end=arr.length-1;
        System.out.println(search(arr,x,st,end));
    }
}
