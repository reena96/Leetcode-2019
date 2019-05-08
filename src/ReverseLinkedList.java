import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode revHead=null, prev=null;
        if(head==null) return null;
        while(head!=null){
            // There is only one copy of a linked list. By getting reference to head, you're not
            // getting a copy of the linked list. You're just getting a copy of the head that gives
            // you the same access to the head.
            revHead = head;
            head = head.next; // curr needs to be updated before linked list is updated in the next line.
            revHead.next = prev;
            prev = revHead;
        }
        return revHead;
    }

    public static ListNode reverseListLeetCode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


    public static ListNode recursiveReverse(ListNode current) {
        if (current.next == null){
            return current;
        }
        ListNode rest = recursiveReverse(current.next);
        current.next.next = current;
        current.next = null;


        return rest;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        //ListNode revHead = reverseList(node);
        ListNode revHead = recursiveReverse(
                node);
        ListNode curr = revHead;
        while(curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }

        LinkedList<ListNode> ll = new LinkedList<>();
        ll.listIterator(3);

    }
}