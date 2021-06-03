package linkedlist;

public class ReverseLinkedList {
    static Node head;

    public static void main(String[] args) {
        ReverseLinkedList llist = new ReverseLinkedList();
        head = new Node(3);
        Node second = new Node(7);
        Node third = new Node(10);
        Node fourth = new Node(12);
        Node fifth = new Node(15);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        printList(head);
        int length = getLengthOfList(head);
        System.out.println("\nReversed Linked List using array: ");
        printList(reverseListUsingArray(head, length));
        System.out.println("\nReversed Linked List using sliding pointers: ");
        printList(reverseListUsingPointers(head));
    }

    private static Node reverseListUsingPointers(Node head) {
        Node r;
        Node q = null;
        Node p = head;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }

    private static int getLengthOfList(Node head) {
        int i = 0;
        while (head != null) {
            i += 1;
            head = head.next;
        }
        return i;
    }

    private static Node reverseListUsingArray(Node head, int length) {
        int i = 0;
        int[] arr = new int[length];
        Node tmp = head;
        while (tmp != null) {
            arr[i++] = tmp.data;
            tmp = tmp.next;
        }
        tmp = head;
        i--;
        while (tmp != null) {
            tmp.data = arr[i--];
            tmp = tmp.next;
        }
        return head;

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
