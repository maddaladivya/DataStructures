public class BFS{
  void traversal(int n, int[][] m,int v,int e){
    QueueInt q = new QueueInt(6);
    Vertex[] ver = new Vertex[v];
    for(int i=0;i<v;i++){
      ver[i] = new Vertex(i);
    }
    q.enqueue(n);
    ver[n].setTruth(false);
    while(!q.isEmpty()){
      int l = q.dequeue();
      System.out.println(l);
      for(int i=0;i<v;i++){
        if(m[l][i] == 1){
          if(ver[i].truth == true){
            q.enqueue(i);
            ver[i].setTruth(false);
          }
        }
      }
    }
  }
}
