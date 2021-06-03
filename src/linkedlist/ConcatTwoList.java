package linkedlist;

public class ConcatTwoList {
    Node head;

    public static void main(String[] args) {
        ConcatTwoList firstlist = new ConcatTwoList();
        firstlist.head = new Node(5);
        Node fsecond = new Node(19);
        Node fthird = new Node(23);
        firstlist.head.next = fsecond;
        fsecond.next = fthird;

        ConcatTwoList secondtlist = new ConcatTwoList();
        secondtlist.head = new Node(13);
        Node ssecond = new Node(20);
        Node sthird = new Node(31);
        secondtlist.head.next = ssecond;
        ssecond.next = sthird;

        printList(firstlist.head);
        System.out.println();
        printList(secondtlist.head);
        concatLst(firstlist.head, secondtlist.head);
        System.out.println();
        printList(firstlist.head);
    }

    private static void concatLst(Node first, Node second) {
        Node p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = second;
        second = null;
    }

    private static void printList(Node head) {
        System.out.print("head");
        while (head != null) {
            System.out.print(" -> " + head.data);
            head = head.next;
        }
        System.out.print(" -> null");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
