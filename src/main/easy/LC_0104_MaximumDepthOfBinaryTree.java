package main.easy;

import helper.TreeNode;

public class LC_0104_MaximumDepthOfBinaryTree {

    //Question : https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public static void main(String[] args) {
        new LC_0104_MaximumDepthOfBinaryTree().maxDepth(new TreeNode());
    }

    public int maxDepth(TreeNode node) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return 1;

        return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
    }
}
