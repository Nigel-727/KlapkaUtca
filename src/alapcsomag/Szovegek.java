package alapcsomag;
//20161222Th
public class Szovegek {
  public static void main(String[] args) {
    String reklámFelirat = new String("Szeretek Java-ban programozni. ");
    int lépésszám = 40;
    for (int i = 1; i <= lépésszám; i++) {
      char sEleje = reklámFelirat.charAt(0);
      String sMaradék = reklámFelirat.substring(1);
      reklámFelirat = sMaradék + sEleje;
      System.out.println(reklámFelirat);
/*      
      for (int j=1; j<=reklámFelirat.length(); j++)
        System.out.print((char)8); //ez Netbeans output ablakban hibásan működik 
      System.out.print(reklámFelirat);
      //stb
*/
    }
  }
}
