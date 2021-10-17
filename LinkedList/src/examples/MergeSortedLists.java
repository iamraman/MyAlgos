package examples;

//Remember merge conditions in merge-sort ? 4 conditions, just put same here
// A == null ? put all from B
// B == null ? put all from A
// A.val < B.val ? put from A incr
// put from B and incr

public class MergeSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
	      if(null == l1 && null == l2)
	        return null;
	      else if(null == l1)
	        return l2;
	      else if(null == l2)
	        return l1;
	      
	      ListNode answer;
	      ListNode i = l1;
	      ListNode j = l2;
	      
	      if(i.val < j.val){
	        answer = new ListNode(i.val,null);
	        i = i.next;
	      }else{
	        answer = new ListNode(j.val,null);
	        j = j.next;
	      }
	      
	      ListNode temp = answer;
	      while(i != null || j != null){
	        if(i == null){
	          ListNode newNode = new ListNode(j.val,null);
	          temp.next = newNode;
	          temp = newNode;
	          j = j.next;
	        }
	        else if(j == null){
	          ListNode newNode = new ListNode(i.val,null);
	          temp.next = newNode;
	          temp = newNode;
	          i = i.next;
	        }
	        else if(i.val < j.val){
	          ListNode newNode = new ListNode(i.val,null);
	          temp.next = newNode;
	          temp = newNode;
	          i = i.next;
	        }
	        else {
	          ListNode newNode = new ListNode(j.val,null);
	          temp.next = newNode;
	          temp = newNode;
	          j = j.next;
	        }
	      }
	      return answer;
	    }
}

class ListNode {
	
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}