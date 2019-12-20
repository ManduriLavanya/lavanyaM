package sample;

public class LogicDD {
	
	NodeLL tail;
	NodeLL head;
public void insertAtBeg(String data) {
	NodeLL n=new NodeLL();
	NodeLL head;
	n.data=data;
	n.prev=null;	
	head=n;
	n.next=head;
	
}
public void insertAt(int index,String data) {
	
	NodeLL n=new NodeLL();	
	NodeLL n1=head;
	n.data=data;
	if(index==0) {
		insertAtBeg(data);
	}
	else {
	for(int i=0;i<index-1;i++) {
		n1=n1.next;
	}
		
	n.next=n1.next;
	n1.next.prev=n;
	n1.next=n;
	n.prev=n1;
	}
}
public void insertAtEnd(String data) {
	NodeLL n=new NodeLL();
	NodeLL n1=tail;
	n.data=data;
	n.next=null;
	tail.next=n;
	n.prev=tail;
	tail=n;
}
public void show() {
	NodeLL n1=head;
	while(n1!=null) {
		System.out.println(n1.data);
		n1=n1.next;
	}

}
}
