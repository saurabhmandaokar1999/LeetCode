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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //column axis vs (row level vs priority queue)  
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tm = new TreeMap<>();
        helper(root, tm, 0, 0);

        List<List<Integer>> ans = new ArrayList<>();

        for (Integer xasis : tm.keySet()) {
            List<Integer> row = new ArrayList<>();

            TreeMap<Integer, PriorityQueue<Integer>> t = tm.get(xasis);
            for (Integer level : t.keySet()) {
                PriorityQueue<Integer> pq = t.get(level);
                while (!pq.isEmpty()) {
                    row.add(pq.poll());
                }
            }

            ans.add(row);
        }

        return ans;

    }

    public void helper(TreeNode root, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tm, int level,
            int verticalLevel) {
        if (root == null)
            return;
        if (!tm.containsKey(verticalLevel)) {
            tm.put(verticalLevel, new TreeMap<Integer, PriorityQueue<Integer>>());

        }

        if (!tm.get(verticalLevel).containsKey(level)) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            tm.get(verticalLevel).put(level, pq);
        }

         PriorityQueue<Integer> pq = tm.get(verticalLevel).get(level);
        pq.offer(root.val);

        helper(root.left, tm, level + 1, verticalLevel - 1);
        helper(root.right, tm, level + 1, verticalLevel + 1);

    }
}