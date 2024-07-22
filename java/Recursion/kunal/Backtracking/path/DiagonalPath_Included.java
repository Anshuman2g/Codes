package Backtracking.path;

import java.util.ArrayList;

public class DiagonalPath_Included {
    static ArrayList<String> path(String p, int r, int c) {
        ArrayList<String> ls = new ArrayList<>();
        if (r == 1 && c == 1) {
            ls.add(p);
            return ls;
        }
        if (r > 1) {
            ls.addAll(path(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ls.addAll(path(p + 'R', r , c-1));
        }
        if(r>1 && c>1){
        ls.addAll(path(p+'S',r-1,c-1));
        }
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<String> ls = path("", 3, 3);
        System.out.println(ls);
    }
}
