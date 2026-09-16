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
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
    
        Queue<TreeNode> q = new ArrayDeque<>();

       q.offer(root);

        while(!q.isEmpty()){
            List<Integer> internal = new ArrayList<>();
            int size = q.size();
            for(int i =0;i<size;i++){
                
                TreeNode head = q.poll();
                internal.add(head.val);

                if(head.left!=null){
                    q.offer(head.left);
                }
                if(head.right!=null){
                    q.offer(head.right);
                }
            }

            ans.add(internal);

        }
        return ans;

    }
}
