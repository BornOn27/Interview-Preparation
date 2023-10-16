package archieved.topInterviewQuestions.easy;

public class LC_0026_RemoveDuplicatesFromSortedArray {

    //Questions : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public static void main(String[] args) {
        int[] nums = {1,1,1,2};
        int[] expectedNums = {1,2};

        int k = new LC_0026_RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] == expectedNums[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int c = 0;

        for (int i = 1; i < nums.length; i++) {
            if(nums[c] != nums[i]){
                c++;
                nums[c] = nums[i];
            }
        }

        return c+1;
    }
}
