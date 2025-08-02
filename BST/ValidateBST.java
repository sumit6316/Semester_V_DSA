package BST;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class ValidateBST {

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
    public boolean isValidBST(TreeNode root){
        return validBST(root).isbst;
    }
    class BSTPair{
        long min  = Long.MAX_VALUE;
        long max  = Long.MIN_VALUE;
        boolean isbst = true;
    }
    public BSTPair validBST(TreeNode root){
        if(root == null){
            return new BSTPair();
        }
        BSTPair lbp = validBST(root.left);
        BSTPair rbp = validBST(root.right);
        BSTPair sbp = new BSTPair();
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min,Math.max(rbp.min,root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max<root.val && root.val<rbp.min;
        return sbp;
    }
}
