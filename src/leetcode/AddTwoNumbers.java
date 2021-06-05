package leetcode;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

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
        ListNode g = new ListNode(9);
        l2.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
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
    
    private static int getLength(ListNode listNode){
        int i = 0;
        while (listNode!=null){
            i++;
            listNode = listNode.next;
        }
        return i;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstLength = getLength(l1);
        int secondLength = getLength(l2);
        int max = firstLength>secondLength?firstLength:secondLength;
        int carry = 0;
        ListNode result = new ListNode();
        ListNode curr = result;
        System.out.println("current val:"+curr.val+"    Curr next:"+curr.next+"     current:"+curr);
        int sum=0;
        for (int i = 0; i < max; i++) {
            if (i>=firstLength){
                sum = (l2.val+carry);
                l2 = l2.next;
            }
            else if (i>=secondLength){
                sum = (l1.val+carry);
                l1 = l1.next;

            }else {
                sum = (l1.val+l2.val+carry);
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = sum>=10?1:0;
            result.next = new ListNode(sum%10);
            result = result.next;
            System.out.println("result val:"+result.val+"   result next:"+result.next+"     result:"+result);
        }
        if(carry>0)
        {
            result.next = new ListNode(carry);
            result = result.next;
        }

        System.out.println("current val:"+curr.val+"Curr next:"+curr.next+"current:"+curr);
        return curr;
    }
}
