public class DFS{
  void traversalDFS(int n, int[][] m, int v){
    Vertex[] ver = new Vertex[v];
    for(int i=0;i<v;i++){
      ver[i] = new Vertex(i);
    }
    StackInt stack = new StackInt(v);
    stack.push(n);
    ver[n].truth = false;
    while(!stack.isEmpty()){
      int q = stack.getTop();
      int cnt=0;
      for(int i=0;i<v;i++){
        if(m[q][i] == 1&&ver[i].truth==true){
          stack.push(i);
          cnt++;
          ver[i].truth = false;
        }
      }
      if(cnt==0){
        System.out.print(q + " ");
        stack.pop();
      }
    }
  }
}
