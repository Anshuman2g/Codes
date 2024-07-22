package Backtracking.QueenVarationsReturnType;

import java.util.Arrays;

public class CountQueens {
    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        int i = row;
        int j = col;
        while (i >= 0 & j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        i = row;
        j = col;
        while (i < board.length & j < board.length) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i++;
            j++;
        }
        i = row;
        j = col;
        while (i >= 0 & j < board.length) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }

        i = row;
        j = col;
        while (i < board.length & j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int nqueen(char[][] board, int row, int count) {
        int n = board.length;
        if (row == n) {
            for (var e : board) {
                System.out.println(Arrays.toString(e));
            }
            System.out.println();
            return count + 1;
        }
       
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                count = nqueen(board, row + 1,count);
                board[row][j] = '.';
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        System.out.println(nqueen(board, 0,0));
    }
}
