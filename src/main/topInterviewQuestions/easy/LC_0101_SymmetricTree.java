package main.topInterviewQuestions.easy;

import main.helper.treeNode.TreeNode;

public class LC_0101_SymmetricTree {

    //Question : https://leetcode.com/problems/symmetric-tree/
    public static void main(String[] args) {
        System.out.println(new LC_0101_SymmetricTree().isSymmetric(new TreeNode(1)));
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        if(root.left == null || root.right == null)
            return false;

        return solve(root.left, root.right);
    }

    private boolean solve(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null)
            return true;
        if(n1 == null || n2 == null)
            return false;

        return (n1.val == n2.val) &&
                solve(n1.left, n2.right) &&
                solve(n1.right, n2.left);
    }


}
