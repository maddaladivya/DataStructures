public class Test{
	public static void main(String[] args) {
		QueueInt qi = new QueueInt();
		System.out.println(qi.rear);
		QueueInt qi2 = new QueueInt(10);
		System.out.println(qi2.front);
	}
}