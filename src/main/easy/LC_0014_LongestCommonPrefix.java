package main.easy;

public class LC_0014_LongestCommonPrefix {

    /**
     * Question : https://leetcode.com/problems/longest-common-prefix/
     * Notes :
     *      - Since we need to find Prefix, even if 1 string doesn't have it, we can stop searching.
     *      - Instead of checking prefix in all string iteratively, we can check for maximum possible
     *          Prefix one-by-one
     *
     */

    public static void main(String[] args) {
//        String[] s = {"","",""};
        String[] s = {"flower","flower","flower"};

        String result = new LC_0014_LongestCommonPrefix().longestCommonPrefix(s);

        System.out.println(result);
    }

    public String longestCommonPrefix_v1(String[] s) {
        if(s[0].length() == 0)
            return "";

        int i=-1, c = 0;

        while (c < s[0].length()){
            boolean inc = true;
            for (int j = 1; j < s.length; j++) {
                if(c >= s[j].length()){
                    inc = false;
                }
                else if(s[j].charAt(c) != s[0].charAt(c)){
                    inc = false;
                    break;
                }
            }

            if(inc){
                i++;
                c++;
            }
            else break;
        }

        return s[0].substring(0, i+1);
    }


    /**
     * Observation :
     *  Here we are making 1st string as our Prefix,
     *      Now we are checking entire prefix if exists,
     *      If it is not, then reducing prefix-length by 1.
     *
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){

            /**
             * Why it is checking for 0? as it could produce -1 or [1, ...]?
             *  - It's because Prefix should always starts from 0,
             *      so it's output will be either 0,
             *      or if anything else we are not interested.
             *  - If we check for -1, then we will falsely cover the cases where
             *      substring is common but not from starting, or a "Non-Prefix"
             */

            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
    }

}
