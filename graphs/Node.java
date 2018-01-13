public class Node{
  Vertex v;
  Node next;
  Node(){
    v = new Vertex();
    this.next  = null;
  }
  Node(int value){
    v = new Vertex(value);
    this.next  = null;
  }

}
