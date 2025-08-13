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
    public int countNodes(TreeNode root) {
        //we have to count no of nodes with TC less than o(N)
        //our basic condition will be if root == null return 0 
        if(root==null) return 0;
        //first count left 
        int l=countLeft(root);
        //then count right
        int r=countRight(root); 
        //if both are same then return the no of nodes using formula 
        if(r==l) return (int)Math.pow(2,l)-1;
        //else reccursively all function again for each left and right nodes
        else return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int countLeft(TreeNode root){
        int count=1;
        while(root.left!=null){
            root=root.left;
            count++;
        }
        return count;
    }
    public int countRight(TreeNode root){
        int count=1;
        while(root.right!=null){
            root=root.right;
            count++;
        }
        return count;
    }
}