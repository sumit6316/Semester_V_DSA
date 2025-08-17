package Tree_Basics;

public class FlipEquivalent {

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

    public boolean is_flip_equivalent(TreeNode root1, TreeNode root2){
         if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean flip = is_flip_equivalent(root1.left,root2.right) && is_flip_equivalent(root1.right,root2.left);
        boolean noflip = is_flip_equivalent(root1.left,root2.left) && is_flip_equivalent(root1.right,root2.right);
        return flip || noflip;



    }
    
}
