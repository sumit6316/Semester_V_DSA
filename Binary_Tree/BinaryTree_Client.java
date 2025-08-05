package Tree_;

public class BinaryTree_Client {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(60));
        System.out.println(bt.height());
        bt.PreOrder();
        bt.InOrder();
        bt.PostOrder();
        bt.LevelOrder();
    }
    
}

