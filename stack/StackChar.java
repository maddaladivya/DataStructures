public class StackInt{
	char[] arr;
	public int top;
	StackInt(int sz){
		arr = new int[sz];
		top = -1;
	}
	public void print(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+"	");
		}
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
	public char getTop(){
		if(top!=-1){
			return arr[top];
		}
		else{
			System.out.println("Stack empty");
			return 0;
		}
	}
	public char pop(){
		char temp = arr[top];
		if(top!=-1){
			top--;
			return temp;
		}
		else{
			System.out.println("Cannot pop");
			return 0;
		}
	}
}
