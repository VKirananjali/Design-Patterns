package Adaptor;

public class PhonePayAdaptor implements adaptor {
  PhonePay p= new PhonePay();
  public void compleatePayment(){
    p.completePay();
  }
  public void validatePayment(){
    p.valPay();
  }
}
