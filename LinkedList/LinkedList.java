package LinkedList;

import java.util.HashSet;

import tests.link;

public class LinkedList {
	
	Node first=null;
	

	
	public void insert(int d){
		Node n=new Node(d);
		n.next=first;
		first=n;
	}
	
	public void display(){
		Node temp=first;
		while(temp!=null){
			System.out.println(temp);
			temp=temp.next;
		}
	}
	
	public Node delete(int d){
		//Node del=first;
		Node prev=first;
		Node curr=first;
		
		while(curr.data!=d){
			if(curr.next==null)
				return null;
			else
			{
				prev=curr;
				curr=curr.next;	
			}
		}
		if(curr==first){
			first=first.next;
		}
		else
		{
			prev.next=curr.next;
		}
		return curr;
	}
	
	public Node recRev(Node firstl){
		
		if(firstl==null||firstl.next==null)
			return firstl;
		Node remrev=recRev(firstl.next);
		Node cur=remrev;
		while(cur.next!=null){
			cur=cur.next;
			}
		cur.next=firstl;
		firstl.next=null;
		first=remrev;
		return first;
	}
	


		public void reverse(){
		
		    Node middle = first;
		    Node last = first;
		    Node f = null;
		
		    while(last != null){
		
		        middle = last;
		        last = last.next;
		        middle.next = f;
		        f = middle;
		    }
		
		    first = middle;
		}
	
	
	
	
	
	public void deleteDup(){
		HashSet<Integer> h=new HashSet<Integer>();
		Node temp=null;
		Node chk=first;
		while(chk!=null){
			if(h.contains(chk.data)){
				temp.next=chk.next;
			}
			else
			{
				h.add(chk.data);
				temp=chk;
			}
			chk=chk.next;
		}
		
	}
	
	public Node kthlastElement(int k){
		Node pt1=first;
		Node pt2=first;
		
		for(int i=0;i<k;i++){
			pt1=pt1.next;
		}
		
		while(pt1!=null){
			pt1=pt1.next;
			pt2=pt2.next;
		}
		
		return pt2;
	}
	
	public void rotate(int k){
		
		if(k==0)
			return;
		
		Node curr=first;
		
		int c=1;
		
		while(c<k && curr!=null){
			curr=curr.next;
			c++;
		}
		
		Node kthNode = curr;
		
		while(curr.next!=null){
			curr=curr.next;
		}
		
		curr.next=first;
		first=kthNode.next;
		kthNode.next=null;
		
	}
	
	
	public Node mergeLinkedList(Node l1, Node l2){
		Node dum = new Node(0);
		Node t=dum;
		
		while(l1!=null && l2!=null){
			if(l1.data<l2.data){
				t.next=l1;
				l1=l1.next;
			}
			else{
				t.next=l2;
				l2=l2.next;
			}
			
			t=t.next;
		}
		if(l1!=null)
			t.next=l1;
		if(l2!=null)
			t.next=l2;
		return dum.next;
	}
	
	public String prisecondandlast(int k){
		Node fast=first;
		Node temp=first;
		Node slow=first;
		
		while(fast.next!=null){
			if(k!=0){
				fast=fast.next;
				temp=temp.next;
				k--;
			}
			else{
				slow=slow.next;
				fast=fast.next;
				
			}
		}
		
		return slow.data+" "+temp.data;
		
		
	}
	
	public Node addNums(Node l1,Node l2){
		
		Node dummy = new Node(0);
		Node curr = dummy;
		int sum=0,carry=0;
		Node a=l1,b=l2;
		
		while(a!=null || b!=null){
			int x = (a!=null)?a.data:0;
			int y = (b!=null)?b.data:0;
			sum=x+y+carry;
			carry = sum / 10;
			curr.next = new Node(sum%10);			
			curr=curr.next;
			
			
			if(a!=null)
				a=a.next;
			if(b!=null)
				b=b.next;
			
			
		}
		
		
		
		if(carry>0)
			curr.next=new Node(carry);
		
		
		return dummy.next;
		
	}
	
	public void swapNode(){
		Node swaplink=first;
		Node curr;
		while(swaplink.next!=null);
		{
			curr=swaplink;
			swaplink.next=curr;
			swaplink=swaplink.next;
			
			swaplink=swaplink.next;
		}
		
	}

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.insert(25);
		ll.insert(30);
		ll.insert(40);
		ll.insert(45);
		ll.insert(50);
		
		//ll.swapNode();
		
		ll.display();
		
		System.out.println(ll.prisecondandlast(1));
		//ll.display();
		/*
		System.out.println("Kth Last Ele: "+ ll.kthlastElement(3));
		System.out.println();
		ll.rotate(2);
		//ll.display();
		//System.out.println();
		ll.recRev(ll.first);
		//ll.display();
		ll.reverse();
		//System.out.println();
		//ll.display();
		
		LinkedList list1=new LinkedList();
		list1.insert(7);
		list1.insert(5);
		list1.insert(3);
		list1.insert(1);
		
		LinkedList list2=new LinkedList();
		list2.insert(8);
		list2.insert(6);
		list2.insert(4);
		list2.insert(2);
		System.out.println();
		
		LinkedList l=new LinkedList();
		l.first=l.mergeLinkedList(list1.first, list2.first);
		l.display();
		
		System.out.println();
		System.out.println();
		
		LinkedList list3=new LinkedList();
		list3.insert(2);
		list3.insert(4);
		list3.insert(3);
		//list3.insert(1);
		
		LinkedList list4=new LinkedList();
		list4.insert(5);
		list4.insert(6);
		list4.insert(4);
		
		LinkedList chksum = new LinkedList();
		chksum.first=chksum.addNums(list3.first, list4.first);
		chksum.display();
		//list4.insert(2);
		//ll.delete(40);
		//ll.deleteDup();
		//ll.display();
		*/
	}

}
