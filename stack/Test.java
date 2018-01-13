public class Test{
	public static void main(String[] args) {
		StackInt si1 = new StackInt(2);
		StackInt si2 = new StackInt(2);
		si1.push(100);
		si1.push(200);
		si2.push(100);
		si2.push(230);
		System.out.println(si2.equals(si1));
	}
}