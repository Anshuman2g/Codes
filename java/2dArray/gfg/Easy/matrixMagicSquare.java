import java.util.ArrayList;

public class matrixMagicSquare {
    public static void main(String[] args) {
        int[][]mx={
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=0;i<mx.length;i++){
            int ans=0;
            int ans2=0;
            for(int j=0;j<mx[i].length;j++){
               ans+=mx[i][j];
               ans2+=mx[j][i];
            }
            ls.add(ans);
            ls.add(ans2);
        }

        int cn2=mx[0].length-1;
        int ans3=0,ans4=0;
        for(int i=0;i<mx.length;i++){
                ans3+=mx[i][i];
                ans4+=mx[i][cn2];
                cn2--;
            }
            ls.add(ans3);
            ls.add(ans4);
        System.out.println(ls);
        int fs=ls.get(0);
        boolean flag=true;
        for(var e : ls){
            if(e != fs){
                flag=false;
                System.out.println("not a magic matrix");
                break;
            }
        }
        if(flag){
        System.out.println("its a magic matrix");
        }
    }
}
// https://www.geeksforgeeks.org/check-given-matrix-is-magic-square-or-not/