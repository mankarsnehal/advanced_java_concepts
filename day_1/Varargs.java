// Program number 2

public class Varargs {
  // Can pass any length of arguments to this method
  public static void printShopList(String... arr) {
    int c = 0;
    for (String string : arr) {
      System.out.println("Item " + c + ":" + string);
      c++;
    }
  }

  public static void main(String[] args) {
    String[] arr = { "Soap", "Brush", "Paste", "Paper" };
    printShopList(arr);

    String s1 = "Soap";
    String s2 = "Basket";
    String s3 = "Bottle";
    String s4 = "Pen";
    printShopList(s1, s2, s3, s4);

    printShopList("Soap", "Brush", "Paste", "Paper", "Pen");
  }
}
