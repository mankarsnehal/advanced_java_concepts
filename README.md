# Advanced Java Concepts
All the Advanced Java Concepts

## 1. Generic Methods in Java
 - Generics means parameterized types.
 - Using Generics, it is possible to create classes that work with different data types.

## 2. Variable length of arguments to methods
 - The varrags allows the method to accept zero or muliple arguments.
 - The main advantage is that, we don't have to provide overloaded methods so less code.
 - Can pass any length of arguments to this method

## 3. Substitution Principles in Java
 - In Java, we can pass derived class object into base class type, because it is actually derived from the same Base class.
 - But it is not applicable in case of arrays or any type of lists.

## 4. Use of wildcard Characters
 - The question mark (?) is known as the wildcard in generic programming.
 - It represents an unknown type.
 - The wildcard can be used in a variety of situations such as the type of a parameter, field, or local variable; sometimes as a return type.

## 5. Collections Framework
 - The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 - It provides readymade architecture.
 - It represents a set of classes and interfaces.
 - The following image depicts hierarchy of Collection framework in Java:
   ![image](https://github.com/mankarsnehal/advanced_java_concepts/assets/68723397/421c06fa-77f7-4f21-bf5d-11e9028732bc)


## 6. LinkedLists
 - In java, LinkedLists are doubly LinkedLists - that is they have link to next and prev both nodes
 - LinkedLists are faster in adding and removing items, even in middle
 - ArrayList and LinkedLists are somewhat similar, because they both have so many methods in common
 - But LinkedList is faster if have to add / remove so many items at the middle
 - But LinkedLists occupy more memory that the ArrayList, because has link to both next and prev

## 7. LinkedList Implementation of Queue
 - Queue is used to keep the elements that are processed in the First In First Out (FIFO) manner.
 - For example, the customers in any hotel are served in first come first serve manner.

## 8. HashMaps
 - Java HashMap class implements the Map interface which allows us to store key and value pair, where keys should be unique.
 - HashMap stores each entry in the fom of key:value pair, which same as the Dictionary in Python.
 - Hashmaps are unordered, are accessed using their keys only.
 - HashMap does not retain its order

## 9. LinkedHashMaps
 - Linkedhashmap returns the hashmap in the same order as created.
 - The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
