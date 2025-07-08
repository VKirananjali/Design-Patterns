package registry_based_observer;

public class BitCoinManager extends registry implements cryptoTracker {
  BitCoin bitcoin;
 
  public double getPrice(){
    return bitcoin.price;
  }

  public void setPrice(double p){
    bitcoin.price=p;
    notifySubs();
  }

  public void notifySubs(){
    for(observer o: registered){
      o.notifySub();
    }
  }
}
