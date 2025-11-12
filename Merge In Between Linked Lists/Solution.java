public class Solution {
    
class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l=list1;
        ListNode ll=list1;
        for(int i=0;i<a-1;i++){
            ll=ll.next;
        }
        for(int j=0;j<b+1;j++){
            l=l.next;
        }
        ll.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=l;
        return list1;
    }
}
