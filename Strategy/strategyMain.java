package Strategy;

public class strategyMain {
 public static void main(String[] args) {
  Bike bikeStrategy= new Bike();
  navigator n= new navigator(bikeStrategy);
  n.travel("abc", "xyz");
  Car carStrategy = new Car();
  n.setStrategy(carStrategy);
  n.travel("acb", "wer");
 } 
}
