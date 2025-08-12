

                   // LeetCode Problem: Reverse a Linked List -206 leetcode problem


package Reverse_a_linkedlist;
public class solution {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
   public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
    public static ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
