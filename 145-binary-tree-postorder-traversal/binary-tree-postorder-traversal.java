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
    public List<Integer> postorderTraversal(TreeNode root) {
        //reccursive solution
        List<Integer> list = new ArrayList<>();
        return helper(root,list);
    }
    public List<Integer> helper(TreeNode root,List<Integer> list){
        if(root==null){
            return list;
        }
        if(root.left!=null) helper(root.left,list);
        if(root.right!=null) helper(root.right,list);
        list.add(root.val);
        return list;
    }
}