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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<qSize;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null) {q.offer(temp.left);}
                if(temp.right!=null) {q.offer(temp.right);}
                tempList.add(temp.val);
            }
            ans.add(tempList);
        }
        return ans;

    }
}