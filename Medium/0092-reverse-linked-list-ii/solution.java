
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy= new ListNode(0);
    dummy.next=head;
    ListNode next;
    ListNode prev=dummy;
    for(int i=1;i<left;i++){
    prev=prev.next;
    }
    ListNode curr=prev.next;
    ListNode tail=curr;
     ListNode reverseprev=null;
     int count=right-left+1;
    while(count>0){
   
    ListNode temp=curr.next;
    curr.next=reverseprev;
    reverseprev=curr;
    curr=temp;
    count--;
   }
   prev.next=reverseprev;
   tail.next=curr;
    




    return dummy.next;
}
        
   
}
