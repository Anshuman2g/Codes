package Backtracking.path;

import java.lang.reflect.Array;
import java.util.Arrays;

public class printMatrix_path {
    static void printMatPath(boolean[][] arr, String p, int r, int c, int[][] path, int step) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            path[r][c] = step;
            for (var e : path) {
                System.out.println(Arrays.toString(e));
            }
            System.out.println(p);
            return;
        }
        if (!arr[r][c])
            return;
        arr[r][c] = false;
        path[r][c] = step;
        
        if (r < arr.length - 1) {
            printMatPath(arr, p + 'D', r + 1, c, path, step + 1);
        }
        if (c < arr[0].length - 1) {
            printMatPath(arr, p + 'R', r, c + 1, path, step + 1);
        }
        if (r > 0) {
            printMatPath(arr, p + 'U', r - 1, c, path, step + 1);
        }
        if (c > 0) {
            printMatPath(arr, p + 'L', r, c - 1, path, step + 1);
        }
        arr[r][c] = true;
        path[r][c] = 0;
    }

    public static void main(String[] args) {
        boolean[][] arr = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] arr2 = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        printMatPath(arr, "", 0, 0, arr2, 1);
    }
}
