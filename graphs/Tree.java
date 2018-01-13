import java.lang.*;
class DoubleNode{
  int data;
  DoubleNode left,right;
  DoubleNode(int v){
    this.data = v;
    this.left = this.right = null;
  }
}
class QueueNode{
  DoubleNode[] arr = new DoubleNode[10];
  int front = -1;
  int rear = -1;
  QueueNode(int n){
    arr = new DoubleNode[n];
    this.front = this.rear = -1;
  }
  void enqueue(DoubleNode value){
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
      arr[rear]=value;
    }
  }
  DoubleNode dequeue(){
    if(front == -1 && rear == -1)
      return null;
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
}
public class Tree{
  DoubleNode root=null;
  DoubleNode insert(int value, DoubleNode root){
    if(root == null){
      root = new DoubleNode(value);
      return root;
    }
    if(value<root.data){
      root.left = insert(value,root.left);
    }
    else if (value>root.data){
      root.right = insert(value,root.right);
    }
    return root;
  }
  void inorder(DoubleNode root){
    if(root!=null){
      inorder(root.left);
      System.out.println(root.data+" ");
      inorder(root.right);
    }
  }
  void levelordertraversal(){
    QueueNode q = new QueueNode(20);
    q.enqueue(root);
    int sum = root.data;
    int i=0;
    int count=1,cnt=0;
    while(q.front!=-1&&q.rear!=-1){
      DoubleNode l = q.dequeue();
      if(count+cnt==Math.pow(2,i)){
        System.out.print(sum+" ");
        sum=0;
        count = 0;
        i++;
      }
      if(l.left!=null){
      q.enqueue(l.left);
      sum = sum + l.left.data;
      count++;
      }
      if(l.left == null){
        //count++;
        cnt++;
      }
      if(l.right!=null){
        q.enqueue(l.right);
        sum = sum + l.right.data;
        count++;
      }
      if(l.right==null){
        //count++;
        cnt++;
      }
      //System.out.println(count);
    }
  }
  DoubleNode mirrornodes(DoubleNode left, DoubleNode right){
    if(left==null||right==null)
      return null;
    System.out.println(left.data+" "+right.data);
    mirrornodes(left.left,right.right);
    mirrornodes(left.right,right.left);
    return null;
  }
  DoubleNode mirrortree(DoubleNode node){
      if(node!=null){
        DoubleNode left = mirrortree(node.left);
        DoubleNode right = mirrortree(node.right);
        node.left = right;
        node.right = left;
      }
      return node;
  }
  DoubleNode successor(DoubleNode root,int n){
    if(root.right!=null){
      return null;
    }
    while(root!=null){
      if(n<root.data){
        DoubleNode succ = root;
        root = root.left;
      }
      else if(n>root.data){
        root = root.right;
      }
      else
        break;
    }
    return succ;
  }
  public static void main(String[] args) {
    Tree t = new Tree();
    t.root = t.insert(100,t.root);
    t.root = t.insert(50,t.root);
    t.root = t.insert(300,t.root);
    t.root = t.insert(20,t.root);
    t.root = t.insert(70,t.root);
    t.root = t.insert(150,t.root);
    t.root = t.insert(400,t.root);
    t.root = t.insert(80,t.root);
    t.root = t.insert(500,t.root);
    t.root = t.mirrortree(t.root);
    DoubleNode d = t.successor(t.root,70);
    System.out.println(d.data);
    //t.inorder(t.root);
    //t.levelordertraversal();
    t.root = t.mirrornodes(t.root.left,t.root.right);

  }
}
