public class rowMaxNoOf1 {
    static int maxrow(int[]arr){
        int cn=0;
        for(var e  : arr){
            if(e==1)cn++;
        }
        return cn;
    }
    public static void main(String[] args) {
        int[][]mx={
            {0,1,1,1},
            {0,0,1,1},
            {1,1,1,1},
            {0,0,0,0}
        };
        int max=0;
        int ans=0;
        int row=0;
        for(int i=0;i<mx.length;i++){
            max=maxrow(mx[i]);
            if(max>ans){
                ans=max;
                row=i;
            }
        }
          System.out.println(ans);
          System.out.println(row);
    }
}
