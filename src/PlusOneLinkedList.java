public class PlusOneLinkedList {
    public static ListNode plusOne(ListNode head) {
        if(head == null) return head;
        head.next = plusOne(head.next);
        if(head.next == null || head.next.val == 0){
            if(head.val == 9)
                head.val = 0;
            else{
                head.val = (head.val)+1;
            }
        }
        return head;

    }
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next =  new ListNode(9);
        node.next.next =  new ListNode(9);

        ListNode result = plusOne(node);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
