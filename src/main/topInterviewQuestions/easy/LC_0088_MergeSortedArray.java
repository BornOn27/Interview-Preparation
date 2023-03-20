package main.topInterviewQuestions.easy;

public class LC_0088_MergeSortedArray {

    //Question : https://leetcode.com/problems/merge-sorted-array/
    public static void main(String[] args) {
        int[] m = {1,2,3,0,0,0};
        int[] n = {2,5,6};
        new LC_0088_MergeSortedArray().merge(m, 3, n, n.length);

        for(int i : m)
            System.out.print(i+" ");
    }

    //Merge Algorithm
    public void merge(int[] r, int m, int[] a2, int n) {
        int[] a1 = new int[m];
        for (int i = 0; i < m; i++) {
            a1[i] = r[i];
        }

        m = 0; n = 0;
        int c = 0;

        while (m < a1.length && n < a2.length){
            if(a1[m] < a2[n]){
                r[c++] = a1[m++];
            }
            else r[c++] = a2[n++];
        }

        while (m < a1.length)
            r[c++] = a1[m++];

        while (n < a2.length)
            r[c++] = a2[n++];
    }
}
