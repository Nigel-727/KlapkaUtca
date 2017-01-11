// Alkalom08_dec1Cs
package alapcsomag;

// int év=(new GregorianCalendar()).get(Calendar.YEAR);

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Szökőév { // hány db szökőév volt eddig?
  
  static boolean szökőév(int év) {
    return (év>=1582) &&
      ((év%4==0 && év%100!=0) || (év%400==0));
}
  
  public static void main(String[] args) {
    int aktÉv=(new GregorianCalendar()).get(Calendar.YEAR); //TODO: new anyag
    int szökőévDb = 0;
    for (int év = 1584; év < aktÉv; év+=4)  //az első jó évtől 4-esével
      if (szökőév(év))
        szökőévDb++;
    System.out.println(szökőévDb+" db volt.");
  }
}
