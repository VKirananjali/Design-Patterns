package Singleton;
class Singletone{
  private static Singletone instance=null;

  private Singletone(){}

  public static Singletone getInstance(){
    if(instance==null){
      synchronized(Singletone.class){   // to only syncronize it the instance is not created 
        if(instance==null){
          instance= new Singletone();
        }
      }
    }
    return instance;
  }

  public static void main(String args[]){
    Singletone x=getInstance();
    System.out.println(x);
    Singletone y=getInstance();
    System.out.println(y); 
  }
}

