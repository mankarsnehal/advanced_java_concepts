// Program number 4

import java.util.ArrayList;
import java.util.List;

class Building {
  public String build() {
    return "Building";
  }
}

class House extends Building {
  public String build() {
    return "House";
  }
}

class Office extends Building {
  public String build() {
    return "Office";
  }
}

public class WildCard {
  // Adding the '?' wildcard solves the problem, we can pass
  // Any type that extends the given type
  // Use 'extends' keyword when want to pass child class of given class
  // Here, we are just printing the variables
  // This var is known as the in-variable
  // In this case, have to use 'extends' with the wildcard
  static void printBuilding(List<? extends Building> base) {
    for (int i = 0; i < base.size(); i++) {
      System.out.println("Build " + i + ": " + base.get(i).build());
    }
  }

  // Use 'super' keyword when want to pass parent class of given class
  // Here, we are modifying the var, i.e. adding new obj in the list
  // This var is known as the out-variable
  // In this case, have to use 'super' with the wildcard
  static List<? super House> addHouse(List<? super House> houses) {
    houses.add(new House());
    return houses;
  }

  public static void main(String[] args) {

    // List of Buildings
    List<Building> buildings = new ArrayList<>();
    buildings.add(new Building());
    buildings.add(new Building());
    printBuilding(buildings);

    List<Office> offices = new ArrayList<>();
    offices.add(new Office());
    offices.add(new Office());
    printBuilding(offices);
    // Traditionally compile time error is there to pass Office list
    // In place of the building list

    List<House> houses = new ArrayList<>();
    houses.add(new House());
    houses.add(new House());
    printBuilding(houses);

    addHouse(houses);
    addHouse(buildings);
    // Now can pass super class of the House class
  }
}
