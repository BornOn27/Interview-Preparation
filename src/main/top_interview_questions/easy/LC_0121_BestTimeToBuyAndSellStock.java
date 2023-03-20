package main.top_interview_questions.easy;

public class LC_0121_BestTimeToBuyAndSellStock {

    //Question : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public static void main(String[] args) {
//        int[] p = {7,1,5,3,6,4};
        int[] p = {1,6,4,3,7};
        System.out.println(new LC_0121_BestTimeToBuyAndSellStock().maxProfit(p));
    }

    public int maxProfit(int[] p) {
        int maxProfit = 0;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < p.length; i++) {
            maxProfit = Math.max(maxProfit, p[i] - minNum);
            minNum = Math.min(minNum, p[i]);
        }

        return maxProfit;
    }
}
