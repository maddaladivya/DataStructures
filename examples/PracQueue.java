public class PracQueue{
  People[] arr = new People[5];
	int front = -1;
	int rear = -1;
	PracQueue(){
		arr = new People[5];
		front = -1;
		rear = -1;
	}
	public void print(){
		if(front==-1&&rear==-1){
			System.out.println("Queue Empty");
		}
		for(int i=front;i<=rear;i++){
			System.out.println(this.arr[i].id+" "+this.arr[i].pages+" "+this.arr[i].time);
		}
	}
	public void enqueue(People item){
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
	public People getFront(){
		return arr[front];
	}
	public People dequeue(){
		if(front==-1&&rear==-1){
			System.out.println("Queue empty");
			return null;
		}
		else{
			People temp = new People();
      temp = arr[front];
			if(front==0 && rear==0){
				front=-1;
				rear=-1;
			}
			else{
				front = front +1;
			}
			return temp;
		}
	}
  public void sort(){
    for(int i=0;i<5;i++){
      for(int j=i;j<5;j++){
        if(arr[i].time>arr[j].time){
          People temp = arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        else if(arr[i].time == arr[j].time){
          if(arr[i].pages > arr[j].pages){
            People temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
        else{
          ;
        }
      }
    }
  }
}
