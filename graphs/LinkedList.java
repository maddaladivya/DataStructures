public class LinkedList{
  Node head = null;
  void add(int value){
    Node newnode = new Node(value);
    if(head == null){
      head = newnode;
    }
    else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newnode;
    }
  }
  public void print(){
    if(head == null){
      System.out.println("Empty");
    }
    else{
      Node temp = head;
      while(temp!=null){
        System.out.println(temp.v.value);
        temp = temp.next;
      }
    }
  }
}
