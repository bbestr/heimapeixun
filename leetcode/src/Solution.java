class Solution {
    public ListNode reverseList(ListNode head) {

        /*
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        */

        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;

        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static void main(String[] args) {

        ListNode a1= new ListNode(1,null);
        ListNode a2= new ListNode(2,a1);
        ListNode a3 = new ListNode(3,a2);
        ListNode a4 = new ListNode(4,a3);
        ListNode head = new ListNode(5,a4);

        Solution sol = new Solution();
        ListNode ret = sol.reverseList(head);


        while(ret != null){
            System.out.println(ret.val);
            ret = ret.next;
        }

    }
}