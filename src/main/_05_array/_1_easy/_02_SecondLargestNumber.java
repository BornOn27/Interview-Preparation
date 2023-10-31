package main._05_array._1_easy;

import main._00_helper.Util;

public class _02_SecondLargestNumber {
    //Question-Link :: https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960

    public static void main(String[] args) {
        Util.printArr(getSecondOrderElements(10, new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;

        int min = a[0];
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++){
            int num = a[i];
            //Finding Second Max
            if(num > max){
                secondMax = max;
                max = num;
            } else {
                secondMax = Math.max(secondMax, num);
            }

            //Finding Second Min
            if(num < min){
                secondMin = min;
                min = num;
            } else {
                secondMin = Math.min(secondMin, num);
            }

        }

        return new int[]{secondMax, secondMin};
    }
}
