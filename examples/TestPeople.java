public class TestPeople{
  public static void main(String[] args) {
    PracQueue pq = new PracQueue();
    pq.enqueue(new People(1,150,4));
    pq.enqueue(new People(2,111,7));
    pq.enqueue(new People(3,22,3));
    pq.enqueue(new People(4,45,4));
    pq.enqueue(new People(5,67,2));
    pq.print();
    pq.sort();
    System.out.println("Sorted");
    pq.print();
  }
}
