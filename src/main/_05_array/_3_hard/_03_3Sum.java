package main._05_array._3_hard;

import java.util.*;

public class _03_3Sum {
    //Question-Link :: https://leetcode.com/problems/3sum/

    public static void main(String[] args) {
        System.out.println(new _03_3Sum().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<String> alreadyProcessed = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
//                System.out.println("Sum :: "+sum+" for "+i+" "+j);

                if(map.containsKey((sum * -1))){
                    if(map.get((sum * -1)) != i && map.get((sum * -1)) != j){
                        Integer[] thisArr = new Integer[]{nums[i], nums[j], nums[map.get((sum * -1))]};

                        if(!contains(thisArr, alreadyProcessed)){
                            List<Integer> thisList = new ArrayList<>();
                            thisList.addAll(Arrays.asList(thisArr));

                            result.add(thisList);
                        }
                    }
                }
            }
        }


        return result;
    }

    private boolean contains(Integer[] thisArr, Set<String> alreadyProcessed){
        Arrays.sort(thisArr);

        String thisString = thisArr[0]+ " : "+thisArr[1]+" : "+thisArr[2];

        if (alreadyProcessed.contains(thisString)){
            return true;
        }

        alreadyProcessed.add(thisString);
        return false;
    }
}
