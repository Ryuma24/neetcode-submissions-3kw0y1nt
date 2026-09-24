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

    Map<Integer, Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i =0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }//storing in map because we need index of root every iteration , and cannot directly iterate , map is fast
        
        return build(0, preorder.length-1, preorder, 0, inorder.length-1);



    }


    private TreeNode build(int preStart , int preEnd, int[] preorder , int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd){
           return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int rootIndx = mp.get(root.val);
        int countLeft = rootIndx - inStart; //get count of left subtree 

        root.left = build(preStart + 1 , preStart + countLeft , preorder , inStart , rootIndx-1);
        root.right = build(preStart +countLeft +1,preEnd , preorder, rootIndx+1,  inEnd);

        return root;
        

    }
}
