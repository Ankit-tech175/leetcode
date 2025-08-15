
 
           // LeetCode Problem: Sort Linked List- 148 no. problem

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getmid(head);
        ListNode righthead=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(righthead);
        return merge(left,right);
    }
    private ListNode getmid(ListNode head){
        ListNode slow= head, fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge( ListNode l1, ListNode l2){
       ListNode dumy= new ListNode(0);
       ListNode tail = dumy;
       while(l1!=null && l2!=null){
        if(l1.val<l2.val){
            tail.next=l1;
            l1=l1.next;
         }
        else{
           tail.next=l2;
            l2=l2.next;
        }
    tail=tail.next;
 }
      tail.next=(l1 !=null) ? l1: l2;
    return dumy.next;
    }
}

