package Backtracking.QueenVarationsReturnType;

import java.util.Arrays;

public class nqueenn {
    static void nqueen(char[][]board, int row){
        if(row == board.length){
            for(var e : board){
                System.out.println(Arrays.toString(e));
            }
            System.out.println();
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board ,row,j)){  // to check whethere there exist any path that would cut two queen by checking rows,columns,diagonal
             board[row][j]='X';
            nqueen(board, row+1);
            board[row][j]='.';
         }
        }
    }
    static boolean isSafe(char[][]board,int row,int col){
        for(int i=0;i<board[0].length;i++){
            if(board[row][i] == 'X'){   //row check
                return false;
            }
        }
        for(int j=0;j<board.length;j++){         //column check
            if(board[j][col] == 'X'){
                return false;
            }
        }
        int i =row;
        int j= col;
        while(i>=0 && j>=0){       //northwest direction
            if(board[i][j] == 'X'){
                return false;
            }
            i--; 
            j--;
        }
       i =row;
       j= col;
        while(i<board.length && j<board.length){       // southeast direction
            if(board[i][j] == 'X'){
                return false;
            }
            i++;
            j++;
        }
        i =row;
        j= col;
        while(i>=0 && j<board.length){     //northeast direction
            if(board[i][j] == 'X'){
                return false;
            }
            i--;
            j++;
        }
        i =row;
        j= col;
        while(i<board.length && j>=0){       //southwest direction
            if(board[i][j] == 'X'){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        char[][]board = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        nqueen( board,0);
    }
}
