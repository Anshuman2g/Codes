package Backtracking.path;

public class AllPath {
    static void allpath(String p , boolean[][]maze,int r, int c){
      if(r==maze.length-1 && c==maze[0].length-1){
        System.out.println(p);
        return;
      }
      if(!maze[r][c]){
        return;
      }
     //everytime we visit a cell mark it as false as we have that cell in our path now
      maze[r][c]=false;

      if(r<maze.length-1){
        allpath(p +'D', maze, r+1, c);
      }
      if(c<maze[0].length-1){
        allpath(p +'R', maze, r, c+1);
      }
      if(r>0){
        allpath(p+'U', maze, r-1, c);
      }
      if(c>0){
        allpath(p+'L', maze, r, c-1);
      }
      //now the functions when gets over revert the changes we made there
      maze[r][c]=true;
    }
    public static void main(String[] args) {
        boolean[][] maze=
        {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
         allpath("", maze, 0, 0);
    }
}
