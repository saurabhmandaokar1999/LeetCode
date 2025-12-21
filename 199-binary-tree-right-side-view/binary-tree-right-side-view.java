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
class Pair{
    TreeNode node;
    int level;
    public Pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        if(root == null){
            return ans;
        }
        q.add(new Pair(root, 0));
        Map<Integer, Integer> mp = new TreeMap<>();
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int level = p.level;

            mp.put(level, node.val);
            if(node.left != null){
                q.add(new Pair(node.left, level+1));
            }
            if(node.right != null){
                q.add(new Pair(node.right, level+1));
            }
        }

        for(Map.Entry<Integer, Integer> entry:mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}