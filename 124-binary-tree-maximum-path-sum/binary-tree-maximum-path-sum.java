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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        //traverse both end 
        int l=helper(root.left);
        int r=helper(root.right);
        //If any path return negative value then we do not take that path and simply assign 0
        if(l<0) l=0;
        if(r<0) r=0;
        ans=Math.max(ans,l+r+root.val); 
        return Math.max(l,r)+root.val;
    }
}