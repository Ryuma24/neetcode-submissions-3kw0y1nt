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
   
    public int kthSmallest(TreeNode root, int k) {
        int[] tmp = new int[2];//used this cause it is passed by reference and not by value 
        tmp[0] = k;
        dfs(root,tmp);
        return tmp[1];
    }

    private void dfs(TreeNode root,int[] tmp){
        
        if(root==null){
            return ;
        }
        
        
        dfs(root.left,tmp);
        if(tmp[0]==0) return; //for stopping further recursion
        tmp[0]--;
        if(tmp[0]==0){
            tmp[1]=root.val;
            return;
        }
        dfs(root.right,tmp);
    }
}

