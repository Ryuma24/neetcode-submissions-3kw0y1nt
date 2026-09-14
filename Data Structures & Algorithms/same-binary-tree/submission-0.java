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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer>l2 = new ArrayList<>();
        dfs(p,l1);
        dfs(q,l2);
        int len = Math.min(l1.size(),l2.size());

        for(int i =0;i<len;i++){
            if(l1.get(i)!=l2.get(i)){
                return false;
            }
        }

        return true;
    }


    public void dfs(TreeNode p , List<Integer> l3){
        if(p==null) {
            l3.add(-1);
            return;
        }

            


        l3.add(p.val);
        dfs(p.left,l3);
        dfs(p.right,l3);
    }



}
