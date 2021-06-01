package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeleteSinglyLinkedList {
    Node head;

    public static void main(String[] args) throws IOException {
        DeleteSinglyLinkedList list = new DeleteSinglyLinkedList();
        list.head = new Node(10);
        Node first = new Node(15);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(52);
        Node fifth = new Node(55);

        list.head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        printList(list.head);
        int choice;
        System.out.println("\nDelete operation:");
        do {
            System.out.println("\n1) Delete head(first)");
            System.out.println("2) Delete after given position");
            System.out.println("Press 0 to exit from loop");
            System.out.println("\nEnter your choice:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            int key = 0;
            switch (choice) {
                case 1:
                    list.head = deleteFirst(list.head);
                    if (list.head != null)
                        printList(list.head);
                    break;
                case 2:
                    System.out.print("Enter index after which you want to delete: ");
                    int pos = Integer.parseInt(br.readLine());
                    list.head = deleteAtGivenPosition(pos, list.head);
                    printList(list.head);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter correct choice");
                    choice = Integer.parseInt(br.readLine());
            }
        } while (choice != 0);
    }

    private static Node deleteAtGivenPosition(int pos, Node head) {
        if (head == null) {
            System.out.println("No data to delete");
            return head;
        }
        Node temp = head;

        if (pos == 0) {
            System.out.println("No data to delete");
            head = temp.next;
            return head;
        }
        for (int i = 0; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("No data to delete");
            return head;
        }
        Node next = temp.next.next;
        temp.next = next;
        return head;
    }

    private static Node deleteFirst(Node head) {
        if (head == null) {
            System.out.println("No data to delete");
            return null;
        }
        Node tmp = head;
        head = head.next;
        tmp = null;
        return head;
    }

    private static void printList(Node head) {
        System.out.print("head ");
        while (head != null) {
            System.out.print(" -> " + head.data);
            head = head.next;
        }
        System.out.print(" -> null ");
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
