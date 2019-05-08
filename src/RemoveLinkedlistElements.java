public class RemoveLinkedlistElements {
   public static ListNode removeElements(ListNode head, int val) {
       if (head == null) return null;
       head.next = removeElements(head.next, val);
       return head.val == val ? head.next : head;
    }

    public static void main(String[] args){
       ListNode node = new ListNode(1);
       node.next =  new ListNode(1);
//        node.next =  new ListNode(2);
//        node.next =  new ListNode(2);
//        node.next =  new ListNode(2);

       ListNode result = removeElements(node,1);
       while (result!=null){
           System.out.println(result.val);
           result = result.next;
       }
    }
}