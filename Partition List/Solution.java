


        // Problem: Partition List - 86 on LeetCode

public class Solution {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode partition(ListNode head, int x) {
        ListNode sList =new ListNode();
        ListNode bList =new ListNode();
        ListNode s=sList;
        ListNode b=bList;
        while(head!=null){
            if(head.val<x){
                s.next=head;
                s=s.next;
            }
            else{
                b.next=head;
                b=b.next;
            }
            head=head.next;
        }
        b.next=null;
        s.next=bList.next;
        return sList.next;
    }
}
