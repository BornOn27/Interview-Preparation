package main._05_array._3_hard;

import java.util.ArrayList;
import java.util.List;

public class _01_PascalTriangle {
    //Question-Link :: https://leetcode.com/problems/pascals-triangle/

    public static void main(String[] args) {
        List<List<Integer>> result = new _01_PascalTriangle().generate(5);
        for(List list : result)
            System.out.println(list);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> r1 = new ArrayList<>();
        r1.add(1);
        result.add(r1);
        if(numRows == 1)
            return result;

        List<Integer> r2 = new ArrayList<>();
        r2.add(1);r2.add(1);
        result.add(r2);
        if(numRows == 2)
            return result;

        for (int i = 3; i <= numRows; i++) {
            List<Integer> rn = new ArrayList<>();
            rn.add(1);
            //Loop for Pascal Triangle
            List<Integer> prev = result.get(i-2);

            for (int j = 0; j < prev.size()-1; j++) {
                int sum = prev.get(j) + prev.get(j+1);
                rn.add(sum);
            }

            rn.add(1);

            result.add(rn);
        }

        return result;
    }
}
