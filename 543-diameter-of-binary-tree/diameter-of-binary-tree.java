/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] arr= new int[1];
        helper(root,arr);
        return arr[0];
    }
    public int helper(TreeNode root, int[] arr){
        if(root==null) return 0;
        int l=helper(root.left,arr);
        int r=helper(root.right,arr); 
        arr[0]=Math.max(arr[0],l+r);
        return 1+Math.max(l,r);
    }
}