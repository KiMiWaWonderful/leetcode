package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.empty()){
            if(cur !=null){
                stack.push(cur);
                cur= cur.left;
            }else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Integer[] nums = {1,null,2,3};
        TreeNode root = ConstructTree.constructTree(nums);
        List<Integer> res =inorderTraversal(root);
        for (int num:res) {
            System.out.print(num+" ");
        }
    }




}
