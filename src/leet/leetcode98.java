package leet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tkkin_000
 */
import java.util.*;
public class leetcode98 {
    
    public boolean isValidBST(TreeNode root) {
        List inorder = inOrder(root);
        for( int i = 1; i < inorder.size(); i++){

            if(inorder.get(i) == (inorder.get(i-1)))
                return false;
        }return true;
    }
    private static List<Integer> inOrder(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if( root == null )
            return res;
        res.addAll(inOrder(root.left));
        res.add(root.val);
        res.addAll(inOrder(root.right));
            return res;
    }
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    
}
