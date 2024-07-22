public class sumOfDiagonal {
    public static void main(String[] args) {
        int[][]mx={
            {1,2,3,4},
            {4,3,2,1},
            {7,8,9,6},
            {6,5,4,3}
        };
        int ans=0;
        int ans2=0;
        int cn=0;
        int cn2=mx[0].length-1;
        for(int i=0;i<mx.length;i++){
            ans+=mx[i][cn++];
            ans2+=mx[i][cn2--];
        }
        System.out.println(ans  +" " + ans2);
    }
}
