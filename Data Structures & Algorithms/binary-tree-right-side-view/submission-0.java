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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root==null) return ans;

        List<List<Integer>> levels = new ArrayList<>();

        Queue<TreeNode>q = new ArrayDeque<>();

        q.offer(root);

        while(!q.isEmpty()){

            

            List<Integer> internal = new ArrayList<>();

            int size = q.size();
            while(size!=0){
                TreeNode head = q.poll();
                internal.add(head.val);

                if(head.left!=null){
                    q.offer(head.left);
                }

                if(head.right!=null){
                    q.offer(head.right);
                }
                size--;

            }

            levels.add(internal);

        }

        for(int i =0;i<levels.size();i++){
            List<Integer> curr = levels.get(i);

            ans.add(curr.get(curr.size()-1));
        }

        return ans;
    }
}
