package gfg.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateby180 {
    public static void main(String[] args) {
        int[][]mx ={
           { 1,  2,  3},
        {4,  5,  6},
        {7,  8,  9}
        };
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=0;i<mx.length;i++){
            for(int j=0;j<mx[i].length;j++){
                ls.add(mx[i][j]);
            }
        }
        int cn=0;
        for(int i=mx.length-1;i>=0;i--){
        for(int j=mx[0].length-1;j>=0;j--){
            mx[i][j]=ls.get(cn++);
        }
        }
        for(var e : mx){
            System.out.println(Arrays.toString(e));
        }
    }
}
// https://www.geeksforgeeks.org/problems/c-matrix-rotation-by-180-degree0745/0
//LEARN INPLACE