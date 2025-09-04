
        // leetcode 24. Swap Nodes in Pairs

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fir=head;
        ListNode sec=head.next;
        fir.next=swapPairs(sec.next);
        sec.next=fir;
        return sec;
    }
}