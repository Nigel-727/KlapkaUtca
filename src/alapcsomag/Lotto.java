// Alkalom09_dec3Sz
package alapcsomag;

import java.util.Arrays;

public class Lotto {
  
  private static void lottó3() { //értéktömbbel
    int[] szelvény = new int[5]; //0..4
    for (int i = 0; i < szelvény.length; i++) 
      szelvény[i] = 0;
    //
    int jószámDb = 0;
    while (jószámDb < 5) {
      int tipp = (int)(Math.random()*90+1);
      int i = 0;
//      while (i<szelvény.length && !(szelvény[i]==tipp)) //helyett gazdaságosabb az alábbi:
      while (i<jószámDb && !(szelvény[i]==tipp))
        i++;
      boolean van = i<jószámDb/*szelvény.length*/;
      if (!van)                    
        szelvény[jószámDb++] = tipp;
    }
    //
    Arrays.sort(szelvény); //emiatt kell az import java.util.Arrays
    //output:
    for (int i = 0; i < szelvény.length; i++) 
        System.out.print(szelvény[i]+" ");
    System.out.println();  
  }
  
  private static void lottó2() { //logikai tömbbel
    boolean[] logikaiTömb = new boolean[91]; //most 1-90 használjuk csak
    for (int i = 1; i <= 90; i++) 
      logikaiTömb[i] = false; //a kiválasztottságot jelző tulajdonságkupac
    //generálás:
    int jószámDb = 0;
    while (jószámDb < 5) {
      int tipp = (int)(Math.random()*90+1);
      if (!logikaiTömb[tipp]) {
        logikaiTömb[tipp] = true;
        jószámDb++;
      }
    }
    //output:
    for (int i = 1; i <= 90; i++) 
      if (logikaiTömb[i])
        System.out.print(i+" ");
    System.out.println();  
  }
  
  private static void lottó1() { //0.
    for (int i = 1; i <= 5; i++) {
      System.out.print(
      (int)(Math.random()*90+1)+" "
      );
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    System.out.println("Ötöslottó szelvény:");
    lottó1();
    lottó2();
    lottó3();
  }
}
