public class People{
  int id;
  int pages;
  int time;
  People(){
    this.id=0;
    this.pages=0;
    this.time=0;
  }
  People(int i, int p,int t){
    this.id = i;
    this.pages = p;
    this.time = t;
  }
  public int getId(){
    return id;
  }
  public int getPages(){
    return pages;
  }
  public int getTime(){
    return time;
  }

}
