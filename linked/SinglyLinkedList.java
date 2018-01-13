         
public class SinglyLinkedList {
	public Node head = null;
	public void insert_at_head(int value) {
		Node newnode = new Node(value);
		if(head==null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void print() {
		if(head == null) {
			System.out.println("Empty");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	public void insert_at_tail(int value) {
		Node n = new Node(value);
		Node temp = head;
		if(head==null) {
			head =n;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	public void insert_at_position(int value, int k) {
		Node newnode = new Node(value);
		Node temp = head;
		int count = 1;
		while(count<k) {
			temp=temp.next;
			count++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
	}
	public void delete_at_position(int k) {
		int count = 1;
		Node temp = head;
		if(k==1) {
			head = head.next;
		}
		while(count!=k-1) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;
	}
	public void delete_value(int value) {
		Node temp = head;
		if(temp.next == null) {
			head=null;
		}
		else if(temp.data == value) {
			head = temp.next;
		}
		else {
			while(temp.next.data!=value) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	public int number_of_nodes() {
		Node temp = head;
		int count=1;
		while(temp != null) {
			temp = temp.next;
			count++;
		}
		return (count-1);
	}
	public int sum_of_nodes() {
		Node temp = head;
		int sum=0;
		while(temp != null) {
			sum = sum + temp.data;
			temp = temp.next;
		}
		return sum;
	}
	public void change_data(int k,int value) {
		Node temp = head;
		int count=1;
		if(k==1) {
			head.data = value;
		}
		while(count!=k-1) {
			temp = temp.next;
			count++;
		}
		temp.next.data = value;
	}
	public void move_largest() {
		Node temp = head;
		int largest=0;
		while(temp!=null) {
			if(temp.data > largest) {
				largest = temp.data;
			}
			temp = temp.next;
		}
		delete_value(largest);
		insert_at_tail(largest);
	}
	public int search_node(int value) {
		Node temp = head;
		int count=1;
		int k=0;
		int flag = 0;
		while(temp.next!=null) {
			if(temp.data == value) {
				k = count;
				flag = 1;
			}
			count++;
			temp= temp.next;
		}
		if(flag == 1)
			return k;
		else
			System.out.println("Not found");
			return 0;

	}
	public SinglyLinkedList concate_list(SinglyLinkedList s1) {
		Node temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = s1.head;
		return s1;
	}
	public void delete_even() {
		Node temp = head;
		int count=1;
		while(temp.next != null) {
			if(count%2 != 0) {
				temp.next = temp.next.next;
			}
			else
			temp = temp.next;
			count++;
		}
	}
	public void delete_odd() {
		Node temp = head;
		int count=1;
		while(temp.next == null) {
			if(count%2 == 0) {
				temp.next = temp.next.next;
			}
			else
			temp = temp.next;
			count++;
		}
	}
	public void split() {
		SinglyLinkedList s1 = new SinglyLinkedList();
		s1.head = head;
		SinglyLinkedList s2 = new SinglyLinkedList() ;
		s2.head = head;
		s1.delete_even();
		s2.delete_odd();
		s1.print();
		s2.print();
	}
	public void reverse(){
		Node currNode=head;
		Node nextNode=null;
		Node prevNode=null;
		while(currNode!=null){
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}
	public void printReverse(Node head)
    {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
}
