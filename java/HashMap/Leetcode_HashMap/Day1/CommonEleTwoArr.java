package Day1;
// https://leetcode.com/problems/find-common-elements-between-two-arrays/

import java.util.HashSet;

public class CommonEleTwoArr {
    public static void main(String[] args) {
       int[] nums1 = {4,3,2,3,1};
       int[] nums2 = {2,2,5,2,3,6};
       HashSet<Integer>st= new HashSet<>();
       for ( var e : nums1){
        st.add(e);
       }

       HashSet<Integer>st2= new HashSet<>();
       for ( var e : nums2){
        st2.add(e);
       }
       int[]arr={0,0};
        int cn=0;
        for( var e : nums2){
            if(st.contains(e)){
                cn++;
            }
        }
        arr[1]=cn;

       int cn2=0;
       for( var e : nums1){
             if(st2.contains(e)){
                cn2++;
             }
       }
       arr[0]=cn2;

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}
