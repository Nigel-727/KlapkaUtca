// Alkalom07_nov29K + ... + dec6K
package alapcsomag;

public class Összegek {
  
  private static int összeg5(int a, int b) { // a ? b
    if (a == b)
      return a;
    return összeg2(Math.max(a,b)) - összeg2(Math.min(a,b)-1);
  }

// a..b intervallumbéléi egészek összege  
  private static int összeg4(int a, int b) { // a<=b
    return összeg2(b)-összeg2(a-1);
  }
  
  private static int összeg1(int n) {
    int összeg = 0;
    for (int i = 1; i <= n; i++) {
      összeg += i;
    }
    return összeg;
  }

  private static int összeg2(int n) {
    return n * (n + 1) / 2;
  }

  private static int összeg3(int n) {
    if (n == 0)
      return 0;    
    return n + összeg3(n - 1);
  }
  
  public static void main(String[] args) {
    System.out.println(összeg4(5,15));
    System.out.println(összeg5(5,15));
    System.out.println(összeg5(15,15));
    System.out.println("A számok összege 1-től 100-ig");
    System.out.println(összeg1(100));
    System.out.println(összeg2(100));
    System.out.println(összeg3(100));
  }
}
