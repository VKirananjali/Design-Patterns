package Factory;

public class rectrangle extends button{
  int width;

  rectrangle(int l, int w){
    length=l;
    width=w;
  }

  public void display(){
    System.out.println("rectrangle object, width="+width);
  }
}