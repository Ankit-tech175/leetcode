

                // Insertion Sort List- LeetCode 147


package Inser_sort_list;
public class Solution {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public ListNode insertionSortList(ListNode head) {
         ListNode dumy = new ListNode(-1);
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            ListNode prev = dumy;
            while (prev.next != null && prev.next.val < cur.val) {
                prev = prev.next;
            }
            cur.next = prev.next;
            prev.next = cur;
            cur = nextNode;
        }
        return dumy.next;
    }   
}
