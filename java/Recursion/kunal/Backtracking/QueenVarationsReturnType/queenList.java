package Backtracking.QueenVarationsReturnType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class queenList {
  
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
 
    static List<List<String>> nqueen(char[][]board, int row,List<List<String>> answer){
        ArrayList<String>ls = new ArrayList<>();
        if(row == board.length){
            for(int i=0;i<board.length;i++){
                String s = "";
                for(int j=0;j<board.length;j++){
                    s+=board[i][j];
                }
                ls.add(s);
            }
            answer.add(ls);
            return answer;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board ,row,j)){  // to check whethere there exist any path that would cut two queen by checking rows,columns,diagonal
             board[row][j]='Q';
            nqueen(board, row+1,answer);
            board[row][j]='.';
         }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n=4;
        char[][]board = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> answer = new ArrayList<>();
       System.out.println(nqueen( board,0,answer));
    }
}
