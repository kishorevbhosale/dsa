package linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertInSinglyLinkedList {
    Node head;

    public static void main(String[] args) throws IOException {
        InsertInSinglyLinkedList list = new InsertInSinglyLinkedList();
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
        System.out.println("Insert operation:");
        do {
            System.out.println("\n1) Insert at the head(first)");
            System.out.println("2) Insert after given position");
            System.out.println("3) Insert at last");
            System.out.println("Press 0 to exit from loop");
            System.out.println("Enter your choice:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            int key = 0;
            switch (choice) {
                case 1:
                    System.out.print("Enter data to add : ");
                    key = Integer.parseInt(br.readLine());
                    list.head = insertAtFirst(key, list.head);
                    printList(list.head);
                    break;
                case 2:
                    System.out.print("Enter index after which you want to add: ");
                    int pos = Integer.parseInt(br.readLine());
                    System.out.print("Enter data to add : ");
                    key = Integer.parseInt(br.readLine());
                    list.head = insertAfterGivenPosition(pos, key, list.head);
                    printList(list.head);
                    break;
                case 3:
                    System.out.print("Enter data to add : ");
                    key = Integer.parseInt(br.readLine());
                    list.head = insertAtLast(list.head, key);
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

    private static Node insertAtLast(Node head, int key) {
        Node tmp = head;
        Node newNode = new Node(key);
        if (tmp == null) {
            return newNode;
        }
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
        return head;
    }

    private static Node insertAfterGivenPosition(int index, int key, Node head) {
        Node tmp = head;
        Node newNode = new Node(key);
        if (head == null) {
            return newNode;
        }
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        newNode.next = tmp.next;
        tmp.next = newNode;
        return head;
    }

    public static Node insertAtFirst(int key, Node head) {
        Node newNode = new Node(key);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
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
