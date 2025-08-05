package Tree_;
import java.util.*;

public class BinaryTree{

    class Node{
        int val ;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc  = new Scanner(System.in);   
    public BinaryTree(){
        root = CreateTree();// CreateTree --> Tree ko create karega aur uska address root mein store kr dega
    }
    private Node CreateTree(){  
        int item=sc.nextInt();
        Node nn = new Node();
        nn.val=item;
        boolean hlc = sc.nextBoolean();
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }

    public void Display(){
        Display(root);

    }

    private void Display(Node nn){
        if(nn == null){
            return;
        }
        String s="";
        s="<-- " +nn.val+ " -->";
        if(nn.left != null){
            s = nn.left.val+s;
        }else{
            s="."+s;
        }
        if(nn.right != null){
            s = s+nn.right.val;
        }else{
            s=s+".";
        }

        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(nn.left);
        int rmax = max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));
    }
    public boolean find(int item){
       return find(root,item);
    }
    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;
    }

    public int height(){
        return height(root);
    }

    private int height(Node nn){
        if(nn==null){
            return -1;
        }

        int lh = height(nn.left);
        int rh = height(nn.right);
        return Math.max(lh,rh)+1;

    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.val+" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    public void InOrder(){
        InOrder(this.root);
        System.out.println();
    }

    private void InOrder(Node nn){
        if(nn==null){
            return;
        }
        InOrder(nn.left);
        System.out.print(nn.val+" ");
        InOrder(nn.right);
    }

    public void PostOrder(){
        PostOrder(this.root);
        System.out.println();
    }

    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }
        PostOrder(nn.left);        
        PostOrder(nn.right);
        System.out.print(nn.val+" ");
    }

    public void LevelOrder(){
        LevelOrder(this.root);
        System.out.println();
    }

    private void LevelOrder(Node nn){
    //    LinkedList <Node> q = new LiskedList<>();
    Queue <Node> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node rv = q.remove();
        System.out.print(rv.val+" ");
        if(rv.left != null){
            q.add(rv.left);
        }
        if(rv.right != null){
            q.add(rv.right);
        }
    }
    System.out.println();
    }
}