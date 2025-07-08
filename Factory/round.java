package Factory;

public class round extends button{
  int radius;

  round(int l, int r){
    length=l;
    radius=r;
  }

  public void display(){
    System.out.println("round object, radius="+radius);
  }
}