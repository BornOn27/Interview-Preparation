package main._05_array.medium;

import main._00_helper.Util;

public class _06_BestTimeToBuyAndSellStock {
    //Question-Link :: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

    public static void main(String[] args) {
        System.out.println(new _06_BestTimeToBuyAndSellStock().maxProfit(new int[]{7,6,4,3,1}));
    }

    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(minBuy, prices[i]);
            sell = Math.max(sell, prices[i] - minBuy);
        }

        return sell;
    }

    public int maxProfit_Better(int[] prices) {
        int[] maxInRight = new int[prices.length];
        int n = prices.length;
        int max = prices[n-1];
        for (int i = prices.length-2; i >= 0; i--) {
            maxInRight[i] = max;
            max = Math.max(max, prices[i]);
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = Math.max(result, maxInRight[i] - prices[i]);
        }

        return result;
    }
}
