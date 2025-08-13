package BST_CW;

public class Distribute_Coins {
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
      int ans = 0;
      public int distributeCoins(TreeNode root){
        minmoves(root);
        return ans;

      }
      public int minmoves(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minmoves(root.left);
        int right = minmoves(root.right);
        ans = ans+Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
      }
    
}
}
