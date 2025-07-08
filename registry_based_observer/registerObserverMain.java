package registry_based_observer;

public class registerObserverMain {
  public static void main(String[] args) {
    BitCoin bitcoin=new BitCoin();
    BitCoinManager man= new BitCoinManager();
    man.bitcoin=bitcoin;
    observer sms= new smsObserver();
    observer email= new emailObserver();
    man.register(sms);
    man.register(email);

    man.setPrice(100);
    System.out.println(man.getPrice());
  }
}
