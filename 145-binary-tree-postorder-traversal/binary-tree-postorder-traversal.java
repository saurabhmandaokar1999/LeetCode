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
        Stack<TreeNode> stk = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        TreeNode last = null;
        TreeNode curr = root;

        while(!stk.isEmpty() || curr!=null){
            if(curr!=null){
                stk.push(curr);
                curr=curr.left;
            }else{
                TreeNode pn = stk.peek();
                if(pn.right!=null && pn.right!=last){
                    curr=pn.right;
                }else{
                    lst.add(pn.val);
                    last=stk.pop();
                }
            }
        }
        return lst;
    }
}