package registry_based_observer;
import java.util.*;
public class registry {
  List<observer> registered = new ArrayList<>();

  void register(observer o){
    registered.add(o);
  }

  void delete(observer o){
    registered.remove(o);
  }
}
