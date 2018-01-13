import java.util.*;
public class AdjacencyList{
  void ListAdj(int v,int e){
    LinkedList[] ll = new LinkedList[v];
    for(int i=0;i<v;i++){
      ll[i]  = new LinkedList();
      ll[i].add(i+1);
    }
    for(int i=0;i<e;i++){
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      ll[x-1].add(y);
      ll[y-1].add(x);
    }
    for(int i=0;i<v;i++){
      Node temp = ll[i].head;
      if(temp == null){
        System.out.println("Empty");
      }
      else{
        while(temp!=null){
          System.out.print(temp.v.value);
          temp = temp.next;
        }
      }
      System.out.println();
    }
    QueueInt q = new QueueInt();
    q.enqueue(0);
    q[0].v.truth = false;
    while(!q.isEmpty()){
      int d = q.dequeue();
      System.out.println(d+1);
      Node tp = q[d].head;
      while(tp!=null){
        if(tp.v.truth)
      }
    }
  }
}
