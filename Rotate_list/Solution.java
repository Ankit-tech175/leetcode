      
   
                 // LeetCode Problem: Rotate List - 61 no. problem
   
   
   public class Solution {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
       ListNode cur =head;
       int len=1;
       while(cur.next!=null){
        cur=cur.next;
        len++;
       }
       cur.next=head;  // make circular
       k=k%len;
       int n=len-k;
       ListNode tail=head;
       for(int i=1;i<n;i++){
        tail=tail.next;
       }
       ListNode newhead= tail.next;
       tail.next=null;
       return newhead;
    }
}

