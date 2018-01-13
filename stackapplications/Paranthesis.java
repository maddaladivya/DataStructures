import java.util.Scanner;
public class Paranthesis{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StackChar stack = new StackChar(str.length());
		int flag=1;
		for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				if(ch=='['||ch=='('||ch=='{'){
					stack.push(ch);
				}
				else if(ch==']'){
					if(stack.getTop()=='['){
						stack.pop();
					}
					else{
						flag = 0;
						break;
					}
				}
				else if(ch=='}'){
					if(stack.getTop()=='{'){
						stack.pop();
					}
					else{
						flag = 0;
						break;
					}
				}
				else if(ch==')') {
					if(stack.getTop()=='('){
						stack.pop();
					}
					else{
						flag = 0;
						break;
					}
				}
		}
		stack.print();
		if(flag == 0){
				System.out.println("Not balanced");
			}
		else{
			if(stack.peek()==-1)
				System.out.println("balanced");
			else
					System.out.println("Not balanced");
			}
	}
}