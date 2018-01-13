public class StackString{
  String[] c;
  int top;
  StackString(int sz){
    this.c = new String[sz];
    this.top = -1;
  }
  public void push(String ch){
    if(top!=c.length){
        top++;
      c[top] = ch;
    }
    else{
    System.out.println("Stack Full");
    }
  }
  public String pop(){
    if(top==-1){
      System.out.println("Stack Empty");
      return "0";
    }
    else{
      String temp = c[top];
      top--;
      return temp;
    }
  }
  public String getTop(){
    if(top!=-1){
      return c[top];
    }
    else{
      System.out.println("Empty");
      return "0";
    }
  }
  public void print(){
    if(top==-1){
      System.out.println("Stack empty");
    }
    else{
      for(int i=0;i<=top+1;i++){
        System.out.print(c[i]+" ");
      }
      System.out.println();
    }
  }
}
