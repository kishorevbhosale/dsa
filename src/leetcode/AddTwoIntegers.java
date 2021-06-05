package leetcode;

public class AddTwoIntegers {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);

        printList(l1);
        ListNode l2 = new ListNode(1);
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(9);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(9);
        ListNode e = new ListNode(9);
        ListNode f = new ListNode(9);

        l2.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println();
        printList(l2);
        System.out.println();
        printList(addTwoNumbers(l1, l2));


    }

    private static void printList(ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val + "  ");
            l1 = l1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        int num1 = 0;
        while (l1 != null) {
            num1 = l1.val * ((int) (Math.pow(10, i)));
            i = i + 1;
            l1 = l1.next;
        }
        i = 0;
        int num2 = 0;
        while (l2 != null) {
            num2 += l2.val * ((int) (Math.pow(10, i)));
            i = i + 1;
            l2 = l2.next;
        }
        int result = num1 + num2;

        int num = result;
        int rem = num % 10;
        num = num / 10;
        ListNode tmp = new ListNode(rem);
        ListNode curr = tmp;

        while (num != 0) {
            rem = num % 10;
            ListNode newNode = new ListNode(rem);
            tmp.next = newNode;
            tmp = tmp.next;
            num = num / 10;
        }
        return curr;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
