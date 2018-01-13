

public class StackChar {
	char[] arr;
	public int top;
	StackChar(int sz){
		top = -1;
		arr = new char[sz];
	}
	public void push(char item){
		top++;
		if(top!=arr.length){
			arr[top]=item;
		}
		else{
			System.out.println("Cannot push. Array full");
		}
	}
	public char pop(){
		if(top==(-1)){
			System.out.println("Cannot pop");
			return 0;
		}
		else{
			return arr[top--];
			
		}
		
	}
	public char getTop(){
		if(top==-1){
			return 0;
		}
		else{
			return arr[top];
		}
	}
	public int peek(){
		return top;
	}

	public void print(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+"	");
		}
		System.out.println();
	}
	public int pre(char c){
		if(c=='+'){
			return 1;
		}
		else if(c=='-'){
			return 1;
		}
		else if(c=='*'){
			return 2;
		}
		else if(c=='/'){
			return 2;
		}
		else if(c=='^'){
			return 3;
		}
		
		else{
			return 0;
		}
	}
}
