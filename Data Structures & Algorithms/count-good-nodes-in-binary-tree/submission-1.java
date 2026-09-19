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
    int cnt = 0;
    public int goodNodes(TreeNode root) {

        
        if(root==null) return 0;

        int rootValue = root.val;

        dfs(root, rootValue);

        return cnt;
    }

    private void dfs(TreeNode root,int rootValue){
        if(root==null)
            return ;

        if(root.val>=rootValue){
            rootValue = root.val;
            cnt++;
        }

        dfs(root.left,rootValue);
        dfs(root.right,rootValue);
    }
}
