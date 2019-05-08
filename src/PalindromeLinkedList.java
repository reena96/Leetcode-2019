import java.util.List;
import java.util.Stack;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class PalindromeLinkedList {

    public static boolean isPalindromeSingleInteger(ListNode head) {
        ListNode curr = head;
        int n = 0;
        while(curr.next != null){
            n = n*10 + curr.val;
            curr = curr.next;
        }
        n = n*10+curr.val;
        int n_copy = n, r, rev = 0;
        while(n>0){
            r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        return rev == n_copy;
    }
    public static boolean isPalindromeDiffNumbers(ListNode head){
        ListNode curr = head;
        if(curr==null) return true;
        Stack<Integer> stack = new Stack<>();
        while(curr.next != null){
            stack.push(curr.val);
            curr = curr.next;
        }
        stack.push(curr.val);
        curr = head;
        while(curr.next != null){
            if(stack.pop()!=curr.val) return false;
            curr = curr.next;
        }
        if(stack.pop()!=curr.val) return false;
        return true;
    }

     public static void main(String[] args){
         ListNode node = new ListNode(12);
         node.next = new ListNode(22);
//         node.next = new ListNode(11);
//         node.next = new ListNode(12);
        // System.out.println(isPalindromeSingleInteger(node));
         System.out.println(isPalindromeDiffNumbers(node));

     }
}
