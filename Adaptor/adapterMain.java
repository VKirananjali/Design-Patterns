package Adaptor;

public class adapterMain {
  public static void main(String[] args) {
    adaptor rasor= new RasorPayAdaptor();
    adaptor phonePay= new PhonePayAdaptor();
    rasor.compleatePayment();
    rasor.validatePayment();
    phonePay.compleatePayment();
    phonePay.validatePayment();
  }
}
