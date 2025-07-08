package Adaptor;

public class RasorPayAdaptor implements adaptor{
  RasorPay r= new RasorPay();
  public void compleatePayment(){
    r.makePayment();
  }
  public void validatePayment(){
    r.valPayment();
  }
}
