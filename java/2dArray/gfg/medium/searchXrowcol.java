package gfg.medium;

import java.util.ArrayList;

public class searchXrowcol {
    static int search(int[] arr, int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int c = mat[0].length - 1;
        int x = 16;
        int ans = -1;
        for (int i = 0; i < mat.length; i++) {
            if (x >= mat[i][0] && x <= mat[i][c]) {
                ans = search(mat[i], x);
                if (ans != -1) {
                    System.out.println("row is" + i + "column is" + ans);
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("not found");
        }

    }
}
