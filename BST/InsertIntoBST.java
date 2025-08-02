package BST;

public class InsertIntoBST {

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
    public TreeNode insertInotBST(TreeNode root,int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val<val){
            root.right = insertInotBST(root.right, val);
        }else{
            root.left = insertInotBST(root.left, val);
        }
        return root;
    }
    
}
