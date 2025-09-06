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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode>st= new Stack<>();
        if(root==null) return l;
        while(root!=null || !st.isEmpty()){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                TreeNode temp=st.peek();
                temp=temp.right;
                if(temp!=null){
                    root=temp;
                }
                else if(temp==null){
                    temp=st.peek();
                    st.pop();
                    l.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        l.add(temp.val);
                    }
                }
            }
        }
    return l;
    }
}