package linkedlist;

public class MergeTwoSortedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next = null;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedList flist = new MergeTwoSortedList();
        flist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        flist.head.next=second;
        second.next = third;

        MergeTwoSortedList slist = new MergeTwoSortedList();
        slist.head = new Node(7);
        second = new Node(8);
        third = new Node(9);
        slist.head.next=second;
        second.next = third;

        printList(flist.head);
        System.out.println();
        printList(slist.head);
        System.out.println();
        printList(sortedMerge(flist.head, slist.head));


    }

    private static Node sortedMerge(Node l1, Node l2) {
        if (l1==null) return l2;
        if (l2==null) return l1;
        if (l1.data<l2.data){
            l1.next = sortedMerge(l1.next, l2);
            return l1;
        }
        else{
            l2.next = sortedMerge(l1, l2.next);
            return l2;
        }
    }

    private static void printList(Node flist) {
        System.out.print("head");
        while (flist!=null){
            System.out.print(" -> "+flist.data);
            flist = flist.next;
        }
        System.out.print(" -> null");
    }
}
