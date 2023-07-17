// Program number 1

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
  static Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
  static Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
  static Boolean[] boolArray = { true, true, false, true, false, false };

  // This method uses Object data type
  // List is a raw type. References to generic type List<E> should be
  // parameterized
  // Here, generic type is not given to the list, makes it raw type.
  public static List objArrayToList(Object[] array, List<Object> list) {
    for (Object object : array) {
      list.add(object);
    }
    return list;
  }

  // Here, we are going to use a generic data type
  public static <T> List<T> genArrayToList(T[] array, List<T> list) {
    for (T object : array) {
      list.add(object);
    }
    return list;
  }

  public static void main(String[] args) {
    List<Character> charList = objArrayToList(charArray, new ArrayList<>());
    List<Integer> intList = objArrayToList(intArray, new ArrayList<>());
    List<Boolean> boolList = objArrayToList(boolArray, new ArrayList<>());
    // Here, it gives warning bcz no specified type to return list from method

    System.out.println(charList.get(0));
    System.out.println(intList.get(0));
    System.out.println(boolList.get(0));

    // List<String> strBoolList = arrayToList(boolArray, new ArrayList<>());
    // System.out.println(strBoolList.get(0));
    // java.lang.ClassCastException: class java.lang.Boolean cannot be cast to class
    // java.lang.String

    List<Character> charListGen = genArrayToList(charArray, new ArrayList<>());
    List<Integer> intListGen = genArrayToList(intArray, new ArrayList<>());
    List<Boolean> boolListGen = genArrayToList(boolArray, new ArrayList<>());
    // Here, is no error becz return type set to generic type T, matches any data
    // type.

    System.out.println(charListGen.get(0));
    System.out.println(intListGen.get(0));
    System.out.println(boolListGen.get(0));
  }
}
