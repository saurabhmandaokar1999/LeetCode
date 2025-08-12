/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //helper for marking parents
        Map<TreeNode,TreeNode> parent = new HashMap<>();
        markParent(root,parent);
        //Queue for bfs 
        Queue<TreeNode> q = new ArrayDeque<>();
        //visited arraylist
        List<TreeNode> vis = new ArrayList<>();
        //List for answer
        List<Integer> ans = new ArrayList<>();
        //put target in queue
        //also mark target as visited
        q.offer(target);
        vis.add(target);
        int level = 0;
        while(!q.isEmpty()){
            int len = q.size();
            if(level==k) break;
            level++;
            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                //move left
                if(curr.left!=null && !vis.contains(curr.left)){
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                //move right
                if(curr.right!=null && !vis.contains(curr.right)){
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                //move up
                TreeNode p = parent.get(curr);
                if(p!=null && !vis.contains(p)){
                    q.offer(p);
                    vis.add(p);
                }
            }
        }
        while(!q.isEmpty()){
            TreeNode c = q.poll();
            ans.add(c.val);
        }
        return ans;
    }
    public void markParent(TreeNode root,Map<TreeNode,TreeNode> parent){
        //dfs call
        if(root == null) return;
        if(root.right!=null) 
        {
          parent.put(root.right,root);
          markParent(root.right,parent);
        }
        if(root.left!=null) 
        {
          parent.put(root.left,root);
          markParent(root.left,parent);
        }
    }
}