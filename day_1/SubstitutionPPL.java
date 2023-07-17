// Program number 3

import java.util.ArrayList;
import java.util.List;

class Base {
  public String wish() {
    return "Hello";
  }
}

class Derived extends Base {
  public String wish() {
    return "Hello";
  }
}

public class SubstitutionPPL {
  static void baseObj(Base base) {
    System.out.println("Wish: " + base.wish());
  }

  static void baseArrObj(List<Base> base) {
    for (int i = 0; i < base.size(); i++) {
      System.out.println("Wish " + i + ": " + base.get(i).wish());
    }
  }

  public static void main(String[] args) {
    Base base = new Base();
    Derived derived = new Derived();

    baseObj(base);
    // Can also pass derived class object into base class type
    // Bcz it is actually derived from the same Base class
    baseObj(derived);

    // But it is not applicable in case of arrays
    List<Base> baseList = new ArrayList<>();
    baseList.add(new Base());
    baseList.add(new Derived());
    baseArrObj(baseList);

    // List<Derived> derivedList = new ArrayList<>();
    // derivedList.add(new Derived());
    // derivedList.add(new Derived());
    // baseArrObj(derivedList);
    // The method baseArrObj(List<Base>) in the type SubstitutionPPL
    // is not applicable for the arguments (List<Derived>)
  }
}
