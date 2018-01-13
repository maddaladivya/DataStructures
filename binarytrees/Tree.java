public class Tree{
  public static void main(String args[])
    {
        Algorithms tree = new Algorithms();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        //tree.root.right = new Node(30);
        tree.root.left.left = new Node(50);
        //tree.root.left.right = new Node(40);
        //tree.root.right.left = new Node(60);
        //tree.root.right.right = new Node(70);


        if(tree.isFullTree(tree.root))
            System.out.println("The binary tree is full");
        else
            System.out.println("The binary tree is not full");
        if(tree.completeTree(tree.root,0,7))
            System.out.println("The binary tree is complete");
        else
            System.out.println("The binary tree is not complete");
        if(tree.skewedTree(tree.root,3))
            System.out.println("The binary tree is skewed");
        else
            System.out.println("The binary tree is not skewed");
    }
}
