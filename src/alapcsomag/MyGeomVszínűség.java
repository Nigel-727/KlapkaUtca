// Alkalom06_nov27V
package alapcsomag;

public class MyGeomVszínűség {
  public static void main(String[] args) {
    double v = Math.random();
    int tipp = v < 1.0/3 ? 1 : v < 2.0/3 ? 2 : 3;
    System.out.println("tipp: "+tipp);
  }
}
