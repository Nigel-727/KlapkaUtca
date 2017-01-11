// Alkalom09_dec3Sz
package alapcsomag;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Prímszámok {

  private static int lépészám = 0;

  public static boolean prím(int szám) { //szakértő
    //lépészám++;
    if (szám == 2)
      return true;
    //lépészám++;
    if (szám < 2 || szám % 2 == 0)
      return false;
    int osztóDb = 1;
    for (int i = 3; i <= Math.sqrt(szám) && osztóDb == 1; i+=2) {
      //lépészám++;      
      if (szám % i == 0)
        osztóDb++;
    }
    return osztóDb==1; //286 lépésszám
  }
  
  private static boolean prím4(int szám) { //szakértő
    lépészám++;
    if (szám == 2)
      return true;
    lépészám++;
    if (szám < 2 || szám % 2 == 0)
      return false;
    int osztóDb = 1;
    for (int i = 3; i <= Math.sqrt(szám); i+=2) {
      lépészám++;      
      if (szám % i == 0)
        osztóDb++;
    }
    return osztóDb==1; //lépésszám 319
  }
  
  private static boolean prím3(int szám) { //szakértő
    lépészám++;
    if (szám < 2)
      return false;
    int osztóDb = 1;
    for (int i = 2; i <= Math.sqrt(szám); i++) {
      lépészám++;      
      if (szám % i == 0)
        osztóDb++;
    }
    return osztóDb==1; //625 lépésszám
  }  
  private static boolean prím2(int szám) { //szakértő
    lépészám++;
    if (szám < 2)
      return false;
    int osztóDb = 0;
    for (int i = 2; i <= szám-1; i++) {
      lépészám++;      
      if (szám % i == 0)
        osztóDb++;
    }
    return osztóDb==0; //amikor kivéve 1 és önmaga (szám)
  } //4951 lépésszám
  
  private static boolean prím99(int szám) { //szakértő
    if (szám < 2)
      return false;
    int osztóDb = 0, i;
    for (i = 2; i <= Math.sqrt(szám) && szám % i != 0; i++) 
      ;
    return i > Math.sqrt(szám);
  }
  
  private static boolean prím1(int szám) { //szakértő; bolondbiztos verzió
    int osztóDb = 0;
    for (int i = 1; i <= szám; i++) {
      lépészám++;      
      if (szám % i == 0)
        osztóDb++;
    }
//    return Math.random()<0.2; //1/5 valószínűség
    return osztóDb==2;
  } //5050 lépésszám
  
  public static void main(String[] args) { //vezérlő
    final int N = 100;
    System.out.println("Prímszámok listája 1-től "+N+"-ig:");
    int prímDb = 0; //megszámolás p.t.
    for (int i = 1; i <= N; i++) {
      if (prím(i)) {
        System.out.print(i+" ");
        prímDb++;
      }
    }
    System.out.println("\n"+prímDb+" db van");
    System.out.println("lépésszám: "+lépészám);
  }
}
