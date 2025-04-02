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

    //can you write this withour using external class
    //just basic programming concept is used
    int max=0;
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        count++;
        int l= diameterOfBinaryTree(root.left);
        int r= diameterOfBinaryTree(root.right);
        count--;
        max = Math.max(max,l+r);
        return count==0 ? max : Math.max(l,r)+1;
    }
}