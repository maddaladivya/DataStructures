public class QueueInt {
	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	QueueInt(){
		arr = new int[10];
		front = -1;
		rear = -1;
	}
	QueueInt(int sz){
		arr = new int[sz];
		front = -1;
		rear = -1;
	}
	public void print(){
		if(front==-1&&rear==-1){
			System.out.println("Queue Empty");
		}
		for(int i=front;i<=rear;i++){
			System.out.println(this.arr[i]);
		}
	}
	public void enqueue(int item){
		if(rear == arr.length-1){
			System.out.println("Queue Full cannot enqueue");
		}
		else{
			if(front==-1&&rear==-1){
				front=0;
				rear=0;
			}
			else{
				rear = rear+1;
			}
			arr[rear]=item;
		}
	}
	public int getFront(){
		return arr[front];
	}
	/*public int dequeue(){
		if(front==-1&&rear==-1){
			System.out.println("Queue empty");
			return 0;
		}
		else{
			int temp = arr[front];
			if(front==0 && rear==0){
				front=-1;
				rear=-1;
			}
			else{
				front = front +1;
			}
			return temp;
		}
	}*/
  public int dequeue(){
if(front == -1 && rear == -1)
return 0;
else if(front == rear){
int temp = front;
front = -1;
rear = -1;
return arr[temp];
}
else{
int temp = front;
front++;
return arr[temp];
}
}
	public boolean isEmpty(){
    if(rear == -1&&front == -1){
      return true;
    }
    else{
      return false;
    }
  }

}
