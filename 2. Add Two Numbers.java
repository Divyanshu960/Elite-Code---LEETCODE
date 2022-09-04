class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0; 
        ListNode rts=new ListNode(0);
        ListNode r = rts;
        while(l1!=null||l2!=null){
            sum /= 10;
            if(l1!=null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2= l2.next;
            }
            ListNode temp = new ListNode(sum%10);
            rts.next = temp;
            rts = rts.next;

        }

        if(sum/10 == 1){
            rts.next = new ListNode(1);
        }

        return r.next;
    }
}
