
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode Dummy = new ListNode(0);
        Dummy.next=head;
        
        ListNode curr = Dummy;
        while(curr.next!=null){
            if(set.contains(curr.next.val)){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return Dummy.next;
    }
}
