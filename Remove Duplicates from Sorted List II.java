class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(head != null){
            while(head.next != null && head.val == head.next.val){
                head = head.next;
            }
            if(prev.next != head){
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
