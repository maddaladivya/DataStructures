import java.util.Scanner;
public class PostFix{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StackChar stack = new StackChar(str.length());
		char[] exp = new char[str.length()];
		int j=0;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == '+'||ch == '-'||ch=='*'||ch=='/'||ch=='^'){
				if(stack.peek()==-1){
					stack.push(ch);
				}
				else{
					char key = stack.getTop();
					if(stack.pre(ch)>stack.pre(key)){
						stack.push(ch);
					}
					else{
						while(stack.pre(ch)<=stack.pre(stack.getTop())){
						exp[j] = stack.getTop();
						j++;
						stack.pop();
					}
						stack.push(ch);
					}
				}
			}
			else if(ch == '('){
				stack.push(ch);
			}

			else if(ch == ')'){
				while(stack.getTop()!='('){
					exp[j] = stack.pop();
					j++;
				}
				stack.pop();
			}
			else{
				exp[j] = ch;
				j++;
			}
		}
			while(stack.peek()!=-1){
				exp[j]=stack.getTop();
				j++;
				stack.pop();
			}
		
		for(int i=0;i<str.length();i++){
			System.out.print(exp[i]);
		}
	}
}