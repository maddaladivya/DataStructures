public class Driver
{
	public static void main(String[] args) {
		CircularLinkedList ob1=new CircularLinkedList();
		ob1.insert_At_Head(5);
		ob1.insert_At_Head(15);
		ob1.insert_At_Head(55);
		ob1.insert_At_Head(75);
		ob1.insert_At_Tail(4);
		ob1.insert_At_Tail(2);
		Node n = new Node(12);
		//ob1.insert_After_Node(n,1);
		//ob1.delete_At_Position(3);
		ob1.delete_A_Value(5);
		ob1.print();

		CircularLinkedList ob2=new CircularLinkedList();
		ob2.insert_At_Head(50);
		ob2.insert_At_Head(60);
		ob2.insert_At_Head(70);
		ob2.insert_At_Tail(40);
		ob2.insert_At_Tail(30);
		ob2.print();

		ob1.merge(ob2);
		ob1.print();
	}
}