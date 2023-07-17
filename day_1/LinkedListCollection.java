// Program number 6

import java.util.LinkedList;

public class LinkedListCollection {
  // In java, LL are doubly LL - have link to next and prev both nodes
  // LL are faster in adding and removing items, even in middle

  // ArrayList and LL are somewhat similar, bcz have so many methods in common
  // But LL is faster if have to add / remove so many items at the middle
  // But LL occupy more memory that the ArrL, bcz has link to both next and prev

  public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<>();
    myList.add("A");
    myList.add("B");
    myList.add(1, "C"); // Add at index:1
    System.out.println(myList);

    // Remove an element
    myList.remove(1);
    System.out.println(myList);

  }
}
