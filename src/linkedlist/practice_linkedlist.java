package linkedlist;

public class practice_linkedlist {
    public static void main(String[] args) {
    Node n=new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,new Node(7,null)))))));
    print(n);
    printReverse(n);
    System.out.println(n);
    Node node =CopyLinkedList(n);
    System.out.println(node);
    print(node);
    System.out.println("count:"+count(node));
    node =reverseLinkedList(node);
    print(node);

    }

    private static int count(Node node) {
        if (node!=null)
           return 1+ count(node.next);
        return 0;
    }
//1-2-3-4-5-6
    public static Node reverseLinkedList(Node node) {
        Node first=node;
        Node secound=node.next;
        Node temp;
        boolean b=true;
        while (secound!=null) {
            temp=secound.next;
            secound.next=first;

            if (b) {
                first.next = null;
                b = false;
            }
            first=secound;
            secound=temp;

        }

        return first;
    }
    public static Node CopyLinkedList(Node node) {
        Node n=null;
        if (node!=null){
            n=new Node(node.element,CopyLinkedList(node.next));
        }
        return n;
    }
    public static void print(Node node) {

        if (node != null) {
            System.out.print(node.element);
            System.out.print("-->");
            print(node.next);
        }else
            System.out.println(".");

    }


    public static void printReverse(Node node) {

        if (node != null) {
            printReverse(node.next);
            System.out.print(node.element);
            System.out.print("-->");
        }

    }
}
