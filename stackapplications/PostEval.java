import java.util.Scanner;
import java.util.*;
public class PostEval{
	static int power(int p,int q){
		int mul=1;
		for(int j=0;j<q;j++)
			mul = mul*p;
		return mul;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//String[] arr = str.split(" ");
		StackInt stack = new StackInt(str.length());
		for(int i=0;i<str.length();i++){
		//for ( String ch : arr) {
			char ch = str.charAt(i);
			if(ch == '+'||ch == '-'||ch=='*'||ch=='/'||ch=='^'){
				int a = stack.pop();
				int b = stack.pop();
				switch(ch){
					case '+': stack.push(a+b);break;
					case '-': stack.push(b-a);break;
					case '*': stack.push(b*a);break;
					case '/': stack.push(b/a);break;
					case '^': stack.push(power(b,a));break;
					default: System.out.println("Invalid");break;
				}
				/*if(ch == "+")
					stack.push(a+b);
				else if(ch == "-")
					stack.push(b-a);
				else if(ch == "*")
					stack.push(a*b);
				else if(ch=="/")
					stack.push(b/a);
				else if(ch=="^")
					stack.push(power(b,a));*/
			}
			else{
				int c = Integer.parseInt(String.valueOf(ch));
				stack.push(c);
			}
		}
		stack.print();
	}
}