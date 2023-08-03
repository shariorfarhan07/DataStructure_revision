class Node{
    public int val;
    Node next;
    public Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

public class LinkedListReverse {
    public static void main(String[] args) {
        Node n = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, new Node(6, new Node(7, null)))))));
        print(n);

        print( reverse(n));

    }
    public static Node reverse(Node head) {
        Node current=head,next=null,prev=null,temp=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void print(Node head) {
        System.out.print(head.val);
        if (head.next!=null) {
            System.out.print(" -> ");
            print(head.next);
        }else{
            System.out.println();
        }
    }

}