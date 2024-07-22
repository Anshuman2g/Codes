package Backtracking.KnightsVariation;

import java.util.*;

public class allpath {
    static boolean inBound(char[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col) {
        if (inBound(board, row - 2, col + 1)) { // upward right side
            if (board[row - 2][col + 1] == 'X') {
                return false;
            }
        }

        if (inBound(board, row - 2, col - 1)) { // upward left side
            if (board[row - 2][col - 1] == 'X') {
                return false;
            }
        }

        if (inBound(board, row - 1, col - 2)) { // left upward side
            if (board[row - 1][col - 2] == 'X') {
                return false;
            }
        }

        if (inBound(board, row + 1, col - 2)) { // left downwards side
            if (board[row + 1][col - 2] == 'X') {
                return false;
            }
        }

        if (inBound(board, row - 1, col + 2)) { // right upwards side
            if (board[row - 1][col + 2] == 'X') {
                return false;
            }
        }

        if (inBound(board, row + 1, col + 2)) { // right downward side
            if (board[row + 1][col + 2] == 'X') {
                return false;
            }
        }

        if (inBound(board, row + 2, col - 1)) { // downward left side
            if (board[row + 2][col - 1] == 'X') {
                return false;
            }
        }

        if (inBound(board, row + 2, col + 1)) { // downward right side
            if (board[row + 2][col + 1] == 'X') {
                return false;
            }
        }
        return true;
    }

    static void nknight(char[][] board, int row, int col, int knights) {
        if (knights == 0) {
              for(var e : board){
                System.out.println(Arrays.toString(e));
              }
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board.length) {
            nknight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = 'X';
            nknight(board, row, col + 1, knights - 1);
            board[row][col] = '.';
        }
        nknight(board, row, col + 1, knights);
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = '.';
            }
        }
        nknight(board, 0, 0, 4);
        //run on compiler
        // https://www.jdoodle.com/online-java-compiler
    }
}
