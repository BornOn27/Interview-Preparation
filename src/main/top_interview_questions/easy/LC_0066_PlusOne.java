package main.top_interview_questions.easy;

public class LC_0066_PlusOne {

    //Question : https://leetcode.com/problems/plus-one/

    public static void main(String[] args) {
        int[] arr = {8,9};
        int[] r = new LC_0066_PlusOne().plusOne(arr);

        for(int i : r)
            System.out.print(i+",");
    }

    /**
     * Drawbacks :
     *          - I handled all different cases differently
     *          - We need to create array only if all digits are 9,
     *              i.e, when we reach to end while processing the array.
     *              At that time, we can create array and return
     *              else we dont even need to check the length and all.
     */
    public int[] plusOne_v1(int[] d) {
        if(d[d.length-1] != 9){
            d[d.length-1] += 1;
            return d;
        }

        int num = 0;

        for (int i = d.length-1; i >= 0; i--) {
            num = (num*10) + d[i];
        }

        if((num+"").length() != ((num+1)+"").length()){
            int[] r = new int[d.length+1];
            r[0] = 1;
            return r;
        }
        else {
            d[d.length-1] = 0;

            for (int i = d.length-2; i >=0 ; i--) {
                if(d[i] == 9){
                    d[i] = 0;
                }
                else {
                    d[i] += 1;
                    break;
                }
            }
        }

        return d;
    }

    public int[] plusOne(int[] d){
        for(int i=d.length-1;i>=0;i--){
            if(d[i] != 9){
                d[i] += 1;
                return d;
            }

            d[i] = 0;
        }

        int[] r = new int[d.length+1];
        r[0] = 1;

        return r;
    }
}
