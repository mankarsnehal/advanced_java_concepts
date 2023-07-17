// Program number 8

import java.util.HashMap;

public class HashMapCollection {
  // HashMap stores the values in the fom of key:value pair
  // This is same as the dictionaries in the python.
  // Hashmaps are unordered, are accessed using their keys only
  // Hashmaps does not allow duplicate keys
  // Bcz it would overwwrite the prev value for the key
  public static void main(String[] args) {
    HashMap<String, Integer> phoneBook = new HashMap<>();
    phoneBook.put("snehal", 123456);
    phoneBook.put("shiv", 452317);
    phoneBook.put("shubh", 907856);
    System.out.println(phoneBook);

    if (phoneBook.containsKey("shubh")) {
      phoneBook.remove("shubh");
    } else {
      System.out.println("Not exist..");
    }

    System.out.println(phoneBook);
    phoneBook.clear(); // Deletes all the key:values from the hashmap
    System.out.println(phoneBook);

  }
}
