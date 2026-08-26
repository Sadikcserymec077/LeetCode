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
    HashMap<Integer, Integer> map = new HashMap<>();
    int postIndex = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }   
        postIndex = inorder.length - 1;
        return build(postorder, 0, inorder.length - 1);   
    }
    public TreeNode build(int[] postorder, int left, int right)
    {
        if(left > right)
        {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postIndex--]);
        int inorderIndex = map.get(root.val);
        root.right = build(postorder, inorderIndex + 1, right);
        root.left = build(postorder, left, inorderIndex - 1);
        return root;
    }
}