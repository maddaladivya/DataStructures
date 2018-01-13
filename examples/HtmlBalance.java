import java.util.*;
public class HtmlBalance{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String line = new String();
    line = s.nextLine();
    int flag = 0;
    StackString stk = new StackString(line.length());
    for(int i=0;i<line.length();i++){
      if(line.charAt(i)=='<'&&line.charAt(i+1)!='/'){
        int cnt=1;
        String str="";
        while(line.charAt(cnt+i)!='>'){
          if(line.charAt(cnt+i) == '/'){
            flag = 2;
            break;
          }
          str = str+line.charAt(cnt+i);
          cnt++;
        }
        i = i + cnt;
        if(flag!=2)
        stk.push(str);
        //System.out.println(str);
      }
      else if(line.charAt(i)=='<'&&line.charAt(i+1)=='/'){
        int cnt=0;
        i = i+2;
        String str="";
        while(line.charAt(cnt+i)!='>'){
          str = str+line.charAt(cnt+i);
          cnt++;
        }
        i = i + cnt;
        String sqw = stk.pop();
        if(!sqw.equals(str)){
          flag = 1;
          break;
        }
      }
      else{
        ;
      }
    }
    //stk.print();
    if(stk.top == -1){
    if(flag==0||flag==2){
      System.out.println("Balance");
    }
    else{
      System.out.println("Not Balance");
    }
  }
  else{
    System.out.println("Not Balanced");
  }
  }
}
