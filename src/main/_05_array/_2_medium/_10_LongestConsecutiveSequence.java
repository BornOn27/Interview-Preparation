package main._05_array._2_medium;

import java.util.HashSet;
import java.util.Set;

public class _10_LongestConsecutiveSequence {
    //Question-Link :: https://leetcode.com/problems/longest-consecutive-sequence/description/

    public static void main(String[] args) {
        System.out.println(new _10_LongestConsecutiveSequence().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int result = 0;
        for (int num : set) {
            //Check for num-1, if it exists then we will ignore because it will get used by some sequence
            if(!set.contains(num-1)){
                int currentLength = 1;
                while (set.contains(++num))
                    currentLength++;

                result = Math.max(result, currentLength);
            }
        }

        return result;
    }
}
