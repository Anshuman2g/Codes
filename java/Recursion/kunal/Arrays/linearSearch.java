package Arrays;

public class linearSearch {
    static boolean ans(int[]arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return target == arr[i] || ans(arr,target,i+1);
    } 

    static int ansidx(int[]arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == target) return i;
        return  ansidx(arr,target,i+1);
    }

    static int lastidx(int[]arr,int target,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i] == target) return i;
        return  lastidx(arr,target,i-1);
    }

    static void multipleans(int[]arr,int target,int i){
        if(i== arr.length){
            return;
        }
        if(arr[i] == target) System.out.println(i);
        multipleans(arr,target,i+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int target=2;
          System.out.println(ans(arr,target,0));
          System.out.println(ansidx(arr,target,0));
          System.out.println(lastidx(arr,target,arr.length-1));
              System.out.println(" ");
          int[]arr2={1,4,4,4,4};
          int target2=4;
          multipleans(arr2,target2,0);
    }
}
