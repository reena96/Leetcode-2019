public class RemoveDuplicatesLinkedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur != null){
//            if(){
//                prev.next = null
//            }
            if(cur.next != null && cur.val != cur.next.val){
                prev.next = cur;
                prev = cur;
            } else {
                prev.next = cur;
            }
            cur = cur.next;
        }
        return head.next;
    }
    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next =  new ListNode(1);
        node.next.next =  new ListNode(2);
        node.next.next.next =  new ListNode(2);
        node.next.next.next.next =  new ListNode(2);

        ListNode result = deleteDuplicates(node);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
