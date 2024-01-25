


class Solution {

    
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode[] a = new ListNode[30];
        int len = 0;
        ListNode node = head;
        while(node!=null){ 
            a[len++] = node;
            node=node.next;
        }

        if(len == 1){  
            head = null;
    }   else if(len-n == 0){ 
            head = head.next;
    }   else{
            node =  a[len-n-1];  
            node.next = node.next.next;
    }
        return head;
    }
    

}