public class CircularLinkedList
{
	public Node head=null;
	public void insert_At_Head(int x)
	{
		Node newnode = new Node(x);
		if(head==null)
		{
			head=newnode;
			newnode.next=head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
				temp=temp.next;
			temp.next=newnode;
			newnode.next=head;
			head=newnode;
			
		}
	}
	public void print()
	{
		if(head==null)
			System.out.println("Empty List");
		else
		{
			Node temp = head;
			while(temp.next!=head)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data+"");
			System.out.println();
		}
	}
	public void insert_At_Tail(int value)
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
			newnode.next=head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
		}
	}
	public void insert_After_Node(Node k,int x)
	{
		Node newnode = new Node(x);
		Node temp=head;
		int count=1;
		while(temp.data!=k.data)
		{
			temp=temp.next;
			if(temp==head && temp.data!=k.data)
			{
				System.out.println("Node not available");
				count=0;
				break;
			}
		}
		if(count!=0)
		{
			if(temp.next==head)
			{
				temp.next=newnode;
				newnode.next=head;
			}
			else
			{
				newnode.next=temp.next;
				temp.next=newnode;
			}
		}
	}
	public void delete_At_Position(int k)
	{
		Node temp=head;
		int count=1;
		while(count!=k-1)
		{
			temp=temp.next;
			count++;
		}
		temp.next=temp.next.next;
	}
	public void delete_A_Value(int value)
	{
		Node temp = head;
		if(temp.data==value)
				head=head.next;
		else
		{
			while(temp.next.data!=value)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
	}
	public void merge(CircularLinkedList x)
	{
		Node temp=head;
		while(temp.next!=head)
			temp=temp.next;
		temp.next=  x.head;
		while(temp.next.next!=x.head)
			temp=temp.next;
		temp.next.next=head;
	}
}