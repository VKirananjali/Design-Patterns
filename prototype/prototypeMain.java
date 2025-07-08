package prototype;

public class prototypeMain {
  public static void main(String args[]){
    BackGroundObject tree= new BackGroundObject(0,0, BackGroundType.Tree);
    BackGroundObject tree2= (BackGroundObject) tree.clone();
    System.out.println(tree.x+" "+tree2.x);
    System.out.println(tree.y+" "+tree2.y);
    System.out.println(tree.pixcel+" "+tree2.pixcel);
  }
}
