import java.util.ArrayList;
import java.util.HashSet;

public class CommonEleInAllrow {
    public static void main(String[] args) {
       int [][]arr = {{11, 2, 1, 4, 81},
                     {3, 71, 8, 5, 11},
                     {1,8, 7, 7, 3, 11},
                   {8, 11, 2, 7, 9},
            };
            HashSet<Integer>st = new HashSet<>();
               for(int j=0;j<arr[0].length;j++){
                st.add(arr[0][j]);
               }
            
            System.out.println("the given elements in hashet are  :" +st);

            // ArrayList<Integer>ls = new ArrayList<>();
            // for(int i=1;i<arr.length;i++){
            //     for(int j=0;j<arr[i].length;j++){
            //         if(st.contains(arr[i][j])){
            //             ls.add(arr[i][j]);
            //         }
            //     }
            //     st.clear();
            //     for(var e : ls){
            //         st.add(e);
            //     }
            //     ls=new ArrayList<>();
            // }

            
            for(int i=1;i<arr.length;i++){
                HashSet<Integer> temp = new HashSet<>();
                for(int j=0;j<arr[i].length;j++){
                    if(st.contains(arr[i][j])){
                        temp.add(arr[i][j]);
                    }
                }
                st=temp;
            }
            System.out.println(st);
    }
}
