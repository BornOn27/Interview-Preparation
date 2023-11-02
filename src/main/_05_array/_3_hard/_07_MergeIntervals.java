package main._05_array._3_hard;

import main._00_helper.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _07_MergeIntervals {
    //Question-Link :: https://leetcode.com/problems/merge-intervals/description/

    public static void main(String[] args) {
        Util.printArr(new _07_MergeIntervals().merge(new int[][]{{1,3},{2,16},{15,18},{3,6}}));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0])
                    return o1[0] - o2[0];
                else return o1[1] - o2[1];
            }
        });

        List<int[]> list = new ArrayList<>();
        int i =0;
        while (i < intervals.length){
            int[] thisInterval = intervals[i];

            int j = i+1;
            while (j < intervals.length && thisInterval[1] >= intervals[j][0]){
                if(intervals[j][1] > thisInterval[1])
                    thisInterval[1] = intervals[j][1];
                j++;
            }
            i = j;

            list.add(thisInterval);
        }

        int[][] result = new int[list.size()][2];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }

        return result;
    }
}
