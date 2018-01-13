import java.util.*;
public class Driver{
  static void traversalDFS(int n, int[][] m, int v, Vertex[] ver, StackInt stack,int dest,String a){
    a = a+n;
    if(ver[n].truth == true)
    ver[n].truth = false;
    //stack.push(n);
    if(n == dest)
    System.out.println(a);
    for(int i=0;i<v;i++){
      if(m[n][i] == 1){
        if(ver[i].truth==true)
        traversalDFS(i,m,v,ver,stack,dest,a);
      }
    }
    ver[n].truth = true;
    //stack.push(n);
    //System.out.print(n+" ");

  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		int v,e,x,y ;
		System.out.println("Enter the No. of vertices : ");
		v=in.nextInt();
		System.out.println("Enter the No. of edges : ");
		e=in.nextInt();
    int[][] matrix = new int[v][v];
		System.out.println("Enter edges : <to> <from> ");
		for(int i=0;i<e;i++)
		{
			x=in.nextInt();
			y=in.nextInt();
			matrix[x][y]=1;
      matrix[y][x]=1;
		}
  //  BFS b = new BFS();
    //b.traversal(0,matrix,v,e);
    Vertex[] ver = new Vertex[v];
    for(int i=0;i<v;i++){
      ver[i] = new Vertex(i);
    }
    //DFS d = new DFS();
    String a=" ";
    StackInt stack = new StackInt(v);
    traversalDFS(0,matrix,v,ver,stack,5,a );
    //stack.print();
    //for(int i=0;i<v;i++){
      //ver[i].truth = true;
    //}
    /*StackInt st = new StackInt(v);
    for(int i=0;i<v;i++){
      if(ver[i].truth == true){
        int j = stack.pop();
        if(ver[j].truth == true){
          traversalDFS(j,matrix,v,ver,st);
        }
      }
    }*/
//    AdjacencyList ad = new AdjacencyList();
    //ad.ListAdj(v,e);
    /*int[][] b = new int[v][v];
    for(int i=0;i<v;i++){
      for(int j=0;j<v;j++){
        b[i][j] = matrix[j][i];
      }
    }
    for(int i=0;i<v;i++){
      ver[i].truth = true;
    }
    while(stack.top!=-1){
      int j = stack.pop();
      if(ver[j].truth == true){
        StackInt st = new StackInt(v);
          traversalDFS(j,b,v,ver,st);
          st.print();
          System.out.println();
      }
    }
    for(int i=0;i<v;i++){
      ver[i].truth = true;
    }
    System.out.println("bfs:");
    traversalBFS(1,matrix,v,ver);*/
  }
}
