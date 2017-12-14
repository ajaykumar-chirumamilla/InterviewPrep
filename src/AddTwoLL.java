public class AddTwoLL {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    		int carry = 0;
	ListNode res = null;
	while(l1 != null && l2!=null)
	{
		int sum= l1.val+l2.val+carry;
		carry = sum/10;
		if(res == null) {
			res = new ListNode(sum%10);
		} else {
			ListNode l = new ListNode(sum%10);
			ListNode parse = res;
			while(parse.next!=null) {
				parse = parse.next;
			}
			parse.next = l;
		}
		l1 = l1.next;
		l2 = l2.next;
	}
	while(l1 !=null) {
		int sum = carry+l1.val;
		carry  = sum/10;
		ListNode l =new ListNode(sum%10);
		ListNode parse = res;
		while(parse.next!=null) {
			parse = parse.next;
		}
		parse.next = l;
		l1 = l1.next;
	}
	while(l2 !=null) {
		int sum = carry+l2.val;
		carry  = sum/10;
		ListNode l =new ListNode(sum%10);
		ListNode parse = res;
		while(parse.next!=null) {
			parse = parse.next;
		}
		parse.next = l;
		l2 = l2.next;
	}
	
	if(carry>0){
		ListNode l =new ListNode(carry);
		ListNode parse = res;
		while(parse.next!=null) {
			parse = parse.next;
		}
		parse.next = l;
	}
	
	return res;
 }
}
