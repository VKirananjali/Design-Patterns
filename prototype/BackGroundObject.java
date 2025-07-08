package prototype;
import java.util.*;

public class BackGroundObject implements GraphicalObject {
  int x;
  int y;
  BackGroundType type;
  ArrayList<Integer> pixcel= new ArrayList<>();

  public GraphicalObject clone(){
    return new BackGroundObject(this);
  }

  public BackGroundObject(BackGroundObject b){
    this.x=b.x;
    this.y=b.y;
    this.pixcel= GeneratePixcel();
  }

  public BackGroundObject(int x, int y, BackGroundType type){
    this.x=x;
    this.y=y;
    this.type=type;
    this.pixcel=GeneratePixcel();
  }

  ArrayList<Integer> GeneratePixcel(){
    return this.pixcel;
  }
}
