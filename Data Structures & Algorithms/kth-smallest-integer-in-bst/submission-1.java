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
    Set<Integer> ls = new TreeSet<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        int ans = 0;
        for(Integer num: ls){
             k--;
            if(k==0){
                ans=num;
                break;
            }
           
        }

        return ans;
    }

    private void dfs(TreeNode root){
        if(root==null){
            return ;
        }

        ls.add(root.val);

        dfs(root.left);
        dfs(root.right);
    }
}

