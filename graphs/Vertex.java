public class Vertex{
  int value;
  boolean truth;
  Vertex(){
    this.value = 0;
    this.truth = true;
  }
  Vertex(int v){
    this.value = v;
    this.truth = true;
  }
  public String toString(){
    return value+" ";
  }
  void setTruth(boolean bb){
    this.truth = bb;
  }
}
