package extr;

public class RecursionFactorial {

  public static void main(String[] args) {
    System.out.println("RESULT:"+doFactor(10));
  }

  private static int doFactor(int n) {
    return n == 1 ? 1 : n*doFactor(n-1);
  }
}
