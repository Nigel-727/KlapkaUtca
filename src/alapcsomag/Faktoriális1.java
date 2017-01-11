// Alkalom06_nov27V
package alapcsomag;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Faktoriális1 {
  public static void main(String[] args) {
    System.out.println("n! kiszámítása");
    long n;
    do
      n=extra.Console.readInt("n = ");
    while(n<0);
    //
    int n2 = 0;
    while (n2 <= n) {
      n2++;
      long f=1;                                           //1
      for(long i=1; i<=n2; i++)                            //2
        f*=i;                                             //3
      System.out.println(n2+"! = "+f);
      n2++;
    }
  }
}
