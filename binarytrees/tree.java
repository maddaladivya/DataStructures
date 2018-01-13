public class tree{
  int[] arr;
  int  i=-1;
  public tree(int sz){
    this.i=0;
    this.arr = new int[sz];
  }
  public void insert(int n){
    int j=i;
    while(arr[2*j+1]!=0||arr[2*j]!=0){
      j++;
    }
    if(arr[2*i] == 0){
      arr[2*i] = n;
    }
    else{
    i++;
      arr[2*i+1] = n;
    }
  }
  public void print(){
    for(int k=0;k<arr.length;k++){
      System.out.print(arr[k]+" ");
    }
  }
}
