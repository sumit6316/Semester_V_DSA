package BST_CW;

public class Binary_Tree_Camera {
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
    public int minCameraCover(TreeNode root){
        int c = minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
    }
    int camera = 0;
    public int minCamera(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if(left == -1 || right == -1){     //Is Node pe Camera ki need hai
            camera++;
            return 1;
        }
        else if(left == 1 || right == 1){   //inme se kisi ek pass ya dono ke pass camera hai or dusra wala covered hai
            return 0; //covered hu
        }else{
            return -1; //need a camera
        }


    }
    
}
