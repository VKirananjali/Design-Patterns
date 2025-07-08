package Factory;

public class factoryMain {
  public static button getButton(String type, int l, int w, int r){
    if(type.equals("round")){
      return new round(l, r);
    }
    else if(type.equals("rectrangle")){
      return new rectrangle(l, w);
    }
    else if(type.equals("square")){
      return new square(l);
    }
    return null;
  }

  public static void main(String args[]){
    button b1= getButton("round", 2, 3, 4);
    button b2= getButton("rectrangle", 4, 3, 7);
    button b3= getButton("square", 9, 5, 3);
    b1.display();
    b2.display();
    b3.display();
  }
}
