package BST;

public class SearchInBST {
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

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return root;
        }
        if(root.val == val){
            return root;
        }
        TreeNode ans = null;
        if(val<root.val){
            ans = searchBST(root.left, val);
        }else{
            ans = searchBST(root.right, val);
        }
        return ans; // either null aor address of node.
        
    }
    
}
