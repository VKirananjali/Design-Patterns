package Factory;

public class square extends button {
  public square(int length) {
    this.length = length;
  }

  public void display() {
    System.out.println("square object, length="+length);
  }
}
