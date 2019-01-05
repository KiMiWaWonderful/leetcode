package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

//    public  List<List<Integer>> levelOrder(TreeNode root) {
//
//        ArrayList<List<Integer>> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        LinkedList<Pair<TreeNode,Integer>> queue = new LinkedList<>();
//        queue.addLast(new Pair<>(root,0));
//
//        while (! queue.isEmpty()){
//            Pair<TreeNode,Integer> front = queue.removeFirst();
//            TreeNode node = front.getKey();
//            int level = front.getValue();
//
//            if(level == res.size()){
//                res.add(new ArrayList<>());
//            }
//
//            assert level<res.size();
//
//            res.get(level).add(node.val);
//            if(node.left != null){
//                queue.addLast(new Pair<>(node.left,level+1));
//            }
//            if(node.right != null){
//                queue.addLast(new Pair<>(node.right,level+1));
//            }
//        }
//
//        return res;
//    }

//    public static void main(String[] args) {
////        TreeNode treeNode = new TreeNode()
////        List<List<Integer>> res = levelOrder()
////
////    }

    public  List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int levelNum = -1;

        while ( !queue.isEmpty()){
            int newLevelNum = 0;
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i <levelNum ; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);

                if(node.left != null){
                    queue.add(node.left);
                    newLevelNum++;
                }

                if(node.right != null){
                    queue.add(node.right);
                    newLevelNum++;
                }

            }
            res.add(level);
            levelNum = newLevelNum;
        }

        return res;


    }
}
