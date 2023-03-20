package main.top_interview_questions.easy;

import helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC_0094_BinaryTreeInorderTraversal {

    //Question : https://leetcode.com/problems/binary-tree-inorder-traversal/

    List<Integer> result = null;
    public static void main(String[] args) {
        new LC_0094_BinaryTreeInorderTraversal().inorderTraversal(new TreeNode(1));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inOrder(root);
        return result;
    }

    void inOrder(TreeNode node){
        if(node == null)
            return;

        inOrder(node.left);
        result.add(node.val);
        inOrder(node.right);
    }
}
