package BST;

public class KthSmallest{
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public int kthSmallest(TreeNode root, int k) {
        TreeNode node = inorder(root,k);
        if(node == null){
            return -1;
        }
        return node.val;

    }
    int pos=0;
    public TreeNode inorder(TreeNode root,int k){
        if(root == null){
            return root;
        }
        TreeNode left = inorder(root.left,k);
        if(left != null){
            return left;
        }
        pos++;
        if(pos == k){
            return root;
        }
        return inorder(root.right,k);
        
    }
    
}
