package main.topInterviewQuestions.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_0001_TwoSum {

    /**
     * Question : https://leetcode.com/problems/two-sum/
     * Notes :
     *      - Instead of "Creating and then Checking", we can "Check and Create"
     *
     */
    public static void main(String[] args) {
        int[] num = {3,3};
        int[] result = new LC_0001_TwoSum().twoSum(num, 6);

        System.out.println(result[0]+","+result[1]);
    }

    int[] twoSum_v1(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, List<Integer>> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(m.get(nums[i]) == null)
                m.put(nums[i], new ArrayList<>());

            m.put(nums[i], m.get(nums[i])).add(i);
        }


        for(Integer key : m.keySet()){
            int left = target - key;

            //If both numbers are same, check size of List
            if(key == left && m.get(left).size() >= 2){
                result[0] = m.get(key).get(0);
                result[1] = m.get(key).get(1);
                return result;
            }
            else if(key != left && m.containsKey(left) && m.get(left) != m.get(key)){
                result[0] = m.get(left).get(0);
                result[1] = m.get(key).get(0);
                return result;
            }
        }

        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> m = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            int left = target - nums[i];

            if(m.containsKey(left)){
                result[0] = i;
                result[1] = m.get(left);
                return result;
            }

            m.put(nums[i], i);
        }

        return result;
    }
}
