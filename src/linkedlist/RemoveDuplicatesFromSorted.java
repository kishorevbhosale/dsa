package linkedlist;

public class RemoveDuplicatesFromSorted {
    Node head;

    public static void main(String[] args) {
        RemoveDuplicatesFromSorted llist = new RemoveDuplicatesFromSorted();
        llist.head = new Node(13);
        Node second = new Node(13);
        Node third = new Node(14);
        Node fourth = new Node(16);
        Node fifth = new Node(19);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(llist.head);
        removeDuplicate(llist.head);
        System.out.println();
        printList(llist.head);
    }

    private static void removeDuplicate(Node head) {
        Node p = head;
        Node q = head.next;
        while (q != null) {
            if (p.data != q.data) {
                p = q;
                q = q.next;
            } else {
                p.next = q.next;
                Node tmp = q;
                q = p.next;
                tmp = null;
            }
        }
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
