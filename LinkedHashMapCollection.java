// Program number 9

import java.util.LinkedHashMap;

public class LinkedHashMapCollection {
  // Hashmap does not retain its order
  // Linkedhashmap returns the hashmap in the same order as created.

  // The order can be retained - either by the insertion order or by access order
  public static void main(String[] args) {
    // Linkedhashmap constr can also take 3 args: initialCapacity, loadFactor,
    // accessOrder
    // initialCapacity - Can specify it works like array in terms of memory
    // allocation
    // loadFactor - By default 0.75f i.e. 75%, when this amount is full, expand the
    // map
    // accessOrder - false: order of insertion, true: order of access
    LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(4, 0.75f, true);
    phoneBook.put("snehal", 123456);
    phoneBook.put("shiv", 452317);
    phoneBook.put("shubh", 907856);
    phoneBook.put("kal", 806745);

    // as "snehal" key accessed, comes at the last and all others remain in the same
    // order.
    System.out.println("snehal number: " + phoneBook.get("snehal"));
    System.out.println(phoneBook);
  }
}
