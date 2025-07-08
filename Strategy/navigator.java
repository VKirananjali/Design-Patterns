package Strategy;

public class navigator {
  navigate strategy;
  navigator(navigate s){
    this.strategy=s;
  }

  public void setStrategy(navigate s){
    this.strategy=s;
  }

  public void travel(String from, String to){
    strategy.navigateRoute(from, to);
  }
}
