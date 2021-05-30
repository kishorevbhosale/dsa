package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicOperationInLinkedList {
    Node head;

    public static void main(String[] args) {
        BasicOperationInLinkedList list = new BasicOperationInLinkedList();
        list.head = new Node(1);
        Node second = new Node(3);
        Node third = new Node(9);
        Node fourth = new Node(2);
        Node fifth = new Node(7);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        System.out.println("Iterative traversal of LinkedList: ");
        printList(list.head);
        System.out.println("Recursive traversal of LinkedList: ");
        System.out.print("head");
        recursivePrint(list.head);
        System.out.println("\nPrinting list in reverse order: ");
        System.out.print("head");
        reversePrint(list.head);
        System.out.println(" -> null \n");
        System.out.println("\nIterative Total Nodes = " + iCountNodes(list.head));
        System.out.println("Recursive Total Nodes = " + rCountNodes(list.head));
        System.out.println("\nIterative Sum of all nodes = " + iSumOfAllNodes(list.head));
        System.out.println("Recursive Sum of all nodes = " + rSumOfAllNodes(list.head));
        System.out.println("\nIterative max element from list  = " + iFindMax(list.head));
        System.out.println("Recursive max element from list  = " + rFindMax(list.head));

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("\nEnter key to search : ");
            int key = Integer.parseInt(br.readLine());
            System.out.println("Iterative search is key present  = " + isearchInLList(list.head, key));
            System.out.println("Recursive search is key present  = " + rsearchInLList(list.head, key));
        } catch (IOException e) {
            System.out.println("Exception while reading key!");
        }
    }

    private static boolean rsearchInLList(Node head, int key) {
        if (head == null)
            return false;
        if (head.data == key)
            return true;
        return rsearchInLList(head.next, key);
    }

    private static int rFindMax(Node head) {
        int x = 0;
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        x = rFindMax(head.next);
        return Math.max(x, head.data);
    }

    private static int iFindMax(Node head) {
        int max = Integer.MIN_VALUE;
        while (head != null) {
            if (head.data > max) {
                max = head.data;
                head = head.next;
            }
            head = head.next;
        }
        return max;
    }

    private static int rSumOfAllNodes(Node head) {
        if (head == null)
            return 0;
        return head.data + rSumOfAllNodes(head.next);
    }

    private static int rCountNodes(Node head) {
        if (head == null)
            return 0;
        return 1 + rCountNodes(head.next);

    }

    private static void reversePrint(Node head) {
        if (head == null)
            return;
        reversePrint(head.next);
        System.out.print(" -> " + head.data);
    }

    private static void recursivePrint(Node head) {
        if (head == null) {
            System.out.print(" -> null \n");
            return;
        } else {
            System.out.print(" -> " + head.data);
            recursivePrint(head.next);
        }
    }

    private static boolean isearchInLList(Node head, int key) {
        while (head != null) {
            if (head.data == key)
                return true;
            else
                head = head.next;
        }
        return false;
    }

    private static int iSumOfAllNodes(Node head) {
        int sum = 0;
        while (head != null) {
            sum += head.data;
            head = head.next;
        }
        return sum;
    }

    private static int iCountNodes(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private static void printList(Node head) {
        System.out.print("head -> ");
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null\n");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
