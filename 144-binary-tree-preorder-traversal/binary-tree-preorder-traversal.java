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
    public List<Integer> preorderTraversal(TreeNode root) {
        //Itrative approach
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> lst = new ArrayList<Integer>();

        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode temp = stk.pop();
            if(temp!=null){ lst.add(temp.val);
            if(temp.right!=null) stk.push(temp.right);
            if(temp.left!=null) stk.push(temp.left);
            }
        }        
        return lst;
    }
}