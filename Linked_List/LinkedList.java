package Linked_List;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void AddFirst(int item){
        Node nn = new Node();
        nn.data = item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void AddLast(int item){
        if(size==0){
            AddFirst(item);
        }else{
            Node nn = new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    private Node getNode(int k){
        Node temp = head;
        for(int i=0;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void Add_At_Index(int item,int k){
        if(k==0){
            AddFirst(item);
        }else if(k==size){
            AddLast(item);
        }else{
            Node nn = new Node();
            nn.data=item;
            Node prev = getNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    public int getindex(int k){
        return getNode(k).data;
    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    public int removeFirst(){
        int rv = head.data;
        if(size==1){
            head=null;
            tail=null;
            size--;
        }else{
            Node temp = head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
    public int removeLast(){
        if(size==1){
            return removeFirst();
        }else{
            int rv = tail.data;
            Node sl = getNode(size-1);
            sl.next=null;
            size--;
            return rv;
        }
    }
    public int remove_at_index(int k){
        if(k==0){
            return removeFirst();
        }else if(k==size){
            return removeLast();
        }else{
            Node k_1=getNode(k-1);
            Node kth = getNode(k);
            k_1.next=kth.next;
            kth.next=null;
            size--;
            return kth.data;
        }
    }
    public int size(){
        return size;
    }
    
}
