class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode prev = head;
        ListNode curr=head.next;
        
        while(curr!=null) {
            if(prev.val == curr.val) {
                curr=curr.next;
            }
            else {
                prev.next=curr;
                prev=curr;
                curr=prev.next;
            }
        }
        prev.next=null;
        return head;
    }
}
