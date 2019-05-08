import com.sun.org.apache.bcel.internal.generic.NEW;

public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prev = null;
        if(l1 == null && l2 == null) return l1;
        else if (l1 == null || l2 == null){
            if(l1 == null) prev = l2;
            if(l2 == null) prev = l1;
        }

        ListNode c1 = l1, c2 = l2;
        ListNode new1 = null, new2 = null;
        ListNode low, high = null;
        while(c1!=null && c2!=null){
            new1 = c1; new2 = c2;
            c1 = c1.next; c2 = c2.next;
            orderElements(prev, new1);
            orderElements(new1, new2);
            prev.next = new1;
            new1.next = new2;
            new2.next = null;
            prev = new2;
        }
        while (c1!=null){
            orderElements(prev,c1);
            prev.next = c1;
            c1 = c1.next;
            prev = prev.next;
        }
        while (c2!=null){
            orderElements(prev,c2);
            prev.next = c2;
            c2 = c2.next;
            prev = prev.next;
        }
        return l1;
    }

    public static void orderElements(ListNode node1, ListNode node2){
        if(node1.val > node2.val){
            int temp = node2.val;
            node2.val = node1.val;
            node1.val = temp;
        }
    }

    public static void main(String[] args){
        ListNode node1 = null;
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(2);
        System.out.println(mergeTwoLists(node1,node2));

    }
}
