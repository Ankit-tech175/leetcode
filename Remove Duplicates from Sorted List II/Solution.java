

               // Remove Duplicates from Sorted List II - 82 leetcode problem no.


public class Solution {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dumy= new ListNode(-1);
        dumy.next=head;
        ListNode pre= dumy;
        ListNode cur= head;
        while(cur!=null &&cur.next!=null){
         if(cur.val==cur.next.val){
            while(cur.next!=null && cur.val == cur.next.val ){
                cur=cur.next;
            }
            pre.next=cur.next;
         }
         else{
             pre=pre.next;
         }
         cur=cur.next;
        }
        return dumy.next;
    }
}
