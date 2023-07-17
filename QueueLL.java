// Program number 7

import java.util.LinkedList;

class Customer {
  private boolean hasBeenServed;
  private String name;

  public Customer(String name) {
    hasBeenServed = false;
    this.name = name;
  }

  public void serve() {
    hasBeenServed = true;
    System.out.println(name + " has been served.");
  }

  @Override
  public String toString() {
    return name;
  }
}

public class QueueLL {

  static void serveCustomer(LinkedList<Customer> queue) {

    // poll() method removes and return the first element
    Customer customer = queue.poll();
    customer.serve();

  }

  public static void main(String[] args) {
    LinkedList<Customer> queue = new LinkedList<>();
    queue.add(new Customer("snehal"));
    queue.add(new Customer("shiv"));
    queue.add(new Customer("shubh"));
    queue.add(new Customer("kal"));
    System.out.println(queue);

    serveCustomer(queue);
    System.out.println(queue);

    serveCustomer(queue);
    System.out.println(queue);

  }
}
