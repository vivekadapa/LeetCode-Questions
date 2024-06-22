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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();   
        Stack<TreeNode> st = new Stack<>();
        pushAllLeft(root,st);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            list.add(curr.val);
            pushAllLeft(curr.right,st);
        }
        return list;
    }
    public void pushAllLeft(TreeNode node,Stack<TreeNode> st){
        while(node != null){
            st.add(node);
            node = node.left;
        }
    }
    
}