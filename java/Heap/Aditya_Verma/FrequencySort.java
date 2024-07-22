package Aditya_Verma;

import java.util.*;
public class FrequencySort {
    public static void main(String[] args) {
       int[] nums = {1,1,2,2,2,3};
        HashMap<Integer, Integer> mp = new HashMap<>();
            for (var e : nums) {
                mp.put(e, mp.getOrDefault(e, 0) + 1);
            }
            PriorityQueue<Pair> minheap = new PriorityQueue<>((a, b) -> a.a == b.a ? b.b - a.b : a.a - b.a);
    
            for (var e : mp.entrySet()) {
                minheap.add(new Pair(e.getValue(), e.getKey()));
            }
            int idx = 0;
            while (!minheap.isEmpty()) {
                int n = minheap.peek().a;
                int f = minheap.peek().b;
                for (int i = 0; idx < nums.length && i < n; i++) {
                    nums[idx] = f;
                    idx++;
                }
                minheap.poll();
            }
         System.out.println(nums);
    }
}
