public class Algorithms{
  Node root;
  static int count;
  public Boolean isFullTree(Node node){
    if (node==null){
      return true;
    }
    if(node.left==null&&node.right==null){
      return true;
    }
    if(node.left!=null&&node.right!=null){
      return (isFullTree(node.left)&&isFullTree(node.right));
    }
    return false;
  }
  public Boolean completeTree(Node node,int index, int noofnodes){
    if (node==null){
      return true;
    }
    if(index>=noofnodes){
      return false;
    }
    return completeTree(node.left, 2*index+1, noofnodes)&&completeTree(node.right,2*index+2,noofnodes);
  }
  public Boolean skewedTree(Node node, int cnt){
    Node temp = node;
    int count=2;
    if(node.right!=null){
      count++;
      temp = temp.right;
    }
    else if(node.left!=null){
      count++;
      temp = temp.left;
    }
    if(count==cnt)
      return true;
    else
      return false;
  }
}
