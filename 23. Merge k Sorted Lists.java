/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       
	        if(null == lists || lists.length == 0) return null;
	        int len = lists.length;
	        ListNode result = new ListNode(0);
	        ListNode temp = result;
	        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(len, new Comparator<ListNode>(){
	            @Override
	            public int compare(ListNode v1, ListNode v2){
	                return v1.val - v2.val;
	            }
	        });
	        for(ListNode node:lists){
	            if(null != node)    queue.offer(node);
	        }
	        while(!queue.isEmpty()){
	            ListNode node = queue.poll();
	            if(null != node){
	                temp.next = node;
	                temp = temp.next;
	                if(node.next != null)   queue.offer(node.next);
	            }
	        }
	        return result.next;
	    }
	}
