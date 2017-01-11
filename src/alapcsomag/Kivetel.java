package alapcsomag;

public class Kivetel {
  public static void main(String[] args) {
    int a=5, b=0;
//    System.out.println(a/b);
    System.out.println(3.0/0.0); //infinity
    System.out.println(Math.sqrt(-2)); //NaN
    System.out.println(Math.sqrt(Math.pow(200, 10000))); //Infinity
    System.out.println(0.0/0.0); //NaN
  }
}
