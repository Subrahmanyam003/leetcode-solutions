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
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.add(root);
        while(!queue.isEmpty())
        {
            ArrayList<Integer> tmpans = new ArrayList();
            int nodeCount = queue.size();
            while(nodeCount > 0)
            {
                TreeNode tmpNode = queue.remove();
                tmpans.add(tmpNode.val);
                if(tmpNode.left != null)
                {
                    queue.add(tmpNode.left);
                }
                if(tmpNode.right != null)
                {
                    queue.add(tmpNode.right);
                }
                nodeCount -= 1;
            }
            ans.add(tmpans);
        }
        int len = ans.size();
        for(int i = 0; i < len; i++)
        {
            if(i % 2 == 1)
            {
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}