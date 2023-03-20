package main.topInterviewQuestions.easy;

public class LC_0125_ValidPalindrome {

    //Question Link - https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new LC_0125_ValidPalindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s){
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }

    public boolean isPalindrome_v2(String s) {
        if(s == null || s.length() == 0)
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public boolean isPalindrome_v1(String s) {
        if(s == null || s.length() == 0)
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
//        System.out.println(s);

        int l = 0, r = s.length()-1;

        while (l < r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }
}
