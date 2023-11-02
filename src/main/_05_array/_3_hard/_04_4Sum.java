package main._05_array._3_hard;

import java.util.*;

public class _04_4Sum {
    //Question-Link :: https://leetcode.com/problems/4sum/description/

    public static void main(String[] args) {
        System.out.println(new _04_4Sum().fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Long, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            map.put((long)nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    long search = target - (nums[i]);
                    search -= nums[j];
                    search -= nums[k];
//                    System.out.println("Search :: "+search);
                    if(map.containsKey(search)){
                        int index = map.get(search);
                        if(index != i && index != j && index != k){
                            Integer[] thisNums = new Integer[]{nums[i], nums[j], nums[k], nums[index]};

                            if(!contains(set, thisNums)){
                                result.add(new ArrayList<>(Arrays.asList(thisNums)));
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    private boolean contains(Set<String> set, Integer[] thisNums){
        Arrays.sort(thisNums);
        String string = thisNums[0] + " : "+thisNums[1] + " : "+thisNums[2]+" : "+thisNums[3];
        if(set.contains(string)){
            return true;
        }

        set.add(string);
        return false;
    }
}
