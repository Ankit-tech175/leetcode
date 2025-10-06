

          // Reorder List -143 on LeetCode

public class Solution {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public void reorderList(ListNode head) {
        if(head==null|| head.next==null){
            return ;
        }
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode curr=null;
        ListNode sec= s.next;
        s.next=null;
        while(sec!=null){
            ListNode tem=sec.next;
            sec.next=curr;
            curr=sec;
            sec=tem;
        }
        ListNode first=head;
        ListNode second=curr;
        while(second!=null){
            ListNode tem1=first.next, tem2=second.next;
            first.next=second;
            second.next=tem1;
            first=tem1;
            second=tem2;
        }
    }
}
