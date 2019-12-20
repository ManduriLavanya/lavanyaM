package sample;

public class Logic {
	NodeLL head;
	public void insertAtEnd(String data) {
		NodeLL n=new NodeLL();
		n.data=data;
		n.next=null;
		
		if(head==null) {
			head=n;
		}
		else {
			NodeLL n1=head;
			while(n1.next!=null) {
				n1=(NodeLL) n1.next;
			}
			n1.next=n;
		}
	}
	public void insertAtBeg(String data) {
		NodeLL n=new NodeLL();
		n.data=data;
		n.next=null;
		n.next=head;
		head=n;
	}
	public void insertAt(int index,String data) {
		NodeLL n=new NodeLL();
		n.data=data;
		n.next=null;
		if(index==0) {
			insertAtBeg(data);
		}
		else {
		NodeLL n1=head;
		for(int i=0;i<index-1;i++) {
			n1=n1.next;
		}
		n.next=n1.next;
		n1.next=n;
		}
	}
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			NodeLL n=head;
			NodeLL n1=null;
			for(int i=0;i<index;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	
	public void show() {
		NodeLL n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
