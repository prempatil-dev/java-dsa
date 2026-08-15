public class Functions {
  public static int add(int a, int b) {
    return a + b;
  }
  public static int square(int n) {
    return n * n;
  }
  public static boolean isEven(int n) {
    return n % 2 == 0;
  }
  public static void main(string args[]) {
    System.out.println("Sum: " + add(10, 20));
    System.out.println("Square: " + square(5));
    System.out.print("Is 10 even? " + isEven(10));
  }
}
