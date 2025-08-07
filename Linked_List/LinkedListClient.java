package Linked_List;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(30);
        ll.AddFirst(40);
        ll.AddFirst(50);
        ll.AddFirst(60);
        ll.Display();
        ll.AddLast(100);
        ll.Display();
        ll.Add_At_Index(200,3);
        ll.Display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getindex(3));
    }
    
}
