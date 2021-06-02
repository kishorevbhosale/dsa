package linkedlist;

public class CheckLinkedListSorted {
    Node head;

    public static void main(String[] args) {
        CheckLinkedListSorted llist = new CheckLinkedListSorted();
        llist.head = new Node(3);
        Node second = new Node(7);
        Node third = new Node(10);
        Node fourth = new Node(12);
        Node fifth = new Node(15);

        llist.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(llist.head);
        System.out.println("\nIs list sorted = " + isListSorted(llist.head));
    }

    private static boolean isListSorted(Node head) {
        int x = Integer.MIN_VALUE;
        while (head != null) {
            if (head.data < x)
                return false;
            x = head.data;
            head = head.next;
        }
        return true;
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
