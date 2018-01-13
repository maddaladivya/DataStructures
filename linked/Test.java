
public class Test {

	public static void main(String[] args) {
		SinglyLinkedList ob1 = new SinglyLinkedList();
		SinglyLinkedList ob2 = new SinglyLinkedList();
		ob1.insert_at_head(10);
		ob1.insert_at_head(20);
		ob1.insert_at_head(30);
		ob1.insert_at_head(40);
		ob1.insert_at_tail(50);
		//ob1.print();
		ob1.insert_at_position(60, 3);
		ob1.print();
		ob1.delete_at_position(4);
		ob1.delete_value(40);
		ob1.print();
		System.out.println(ob1.number_of_nodes());
		System.out.println(ob1.sum_of_nodes());
		ob1.change_data(2, 100);
		ob1.print();
		ob1.move_largest();
		ob1.print();
		System.out.println(ob1.search_node(500));
		ob2.insert_at_head(10);
		ob2.insert_at_head(20);
		ob2.insert_at_head(30);
		ob2.insert_at_head(40);
		ob2.insert_at_tail(50);
		ob2.concate_list(ob1);
		ob2.print();
		ob2.delete_odd();
		ob2.print();
		ob2.split();
		ob2.reverse();
		ob2.print();
		Node h = new Node();
		h = ob2.head;
		ob2.printReverse(h);
		ob2.print();
	}

}
