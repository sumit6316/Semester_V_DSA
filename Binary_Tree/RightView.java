package Tree_Basics;
import java.util.*;

public class RightView {
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
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> ll = new ArrayList<>();
        rightSideView(root,1,ll)
    }
    int maxd = 0;
    public void rightSideView(TreeNode root,int cl,List<Integer> ll){
        if(root == null){
            return;
        }
        if(maxd<cl){
            // System.out.println(root.val+" ");
            ll.add(root.val);
            maxd = cl;
        }
        
        rightSideView(root.right,cl+1,ll);
        rightSideView(root.left,cl+1,ll);
    }
    
}
