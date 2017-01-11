// Alkalom03_nov19Sz
package alapcsomag;

public class Téglalap {

  public static void main(String[] args) {
    System.out.println("TÉGLALAP kerülete, területe");
    int a, b;
    a = extra.Console.readInt("A = ");
    b = extra.Console.readInt("B = ");
    if (a > 0) {
      if (b > 0) {
        int kerület = 2 * (a + b), terület = a * b;
        System.out.println("K: " + kerület + "\nT: " + terület);
      } else { //alapból az else a hozzá legközelebbi if-hez tartozik
        System.out.println("hibás _b_ érték");
      }
    } else {
      System.out.println("hibás _a_ érték");
    }
  }
  
  public static void main4(String[] args) {
    System.out.println("TÉGLALAP kerülete, területe");
    int a = extra.Console.readInt("A = ");
    if (a > 0) {
      int b = extra.Console.readInt("B = ");
      if (b > 0) {
        int kerület = 2 * (a + b), terület = a * b;
        System.out.println("K: " + kerület + "\nT: " + terület);
      } else { //alapból az else a hozzá legközelebbi if-hez tartozik
        System.out.println("hibás _b_ érték");
      }
    } else {
      System.out.println("hibás _a_ érték");
    }
  }

  public static void main3(String[] args) {
    System.out.println("TÉGLALAP kerülete, területe");
    int a, b;
    a = extra.Console.readInt("A = ");
    b = extra.Console.readInt("B = ");
    if (a > 0) {
      if (b > 0) {
        int kerület = 2 * (a + b), terület = a * b;
        System.out.println("K: " + kerület + "\nT: " + terület);
      } else { //alapból az else a hozzá legközelebbi if-hez tartozik
        System.out.println("hibás _b_ érték");
      }
    } else {
      System.out.println("hibás _a_ érték");
    }
  }

  public static void main2(String[] args) {
    System.out.println("TÉGLALAP kerülete, területe");
    int a, b;
    a = extra.Console.readInt("A = ");
    b = extra.Console.readInt("B = ");
    if (a > 0 && b > 0) {
      int kerület = 2 * (a + b), terület = a * b;
      System.out.println("K: " + kerület + "\nT: " + terület);
    } else {
      System.out.println("Nem megfelelő oldalhosszúság.");
    }
  }
}
