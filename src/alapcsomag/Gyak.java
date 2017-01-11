package alapcsomag;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gyak { //20161210Sa

  //szám db dobást végez a kockával és kiírja hányszor fordult elő 3-nál nagyobb
  private static void metódus1(int szám) {
    System.out.println("Szám db dobásból...");
    int db = 0, dobás;
    for (int i = 0; i < szám; i++) {
      dobás=(int)(Math.random()*6)+1;
      if (3 < dobás)
        System.out.print(dobás+" ");
        db++;      
    }
    System.out.println();
    System.out.println("... "+db+" alkalommal sikerült 3-nál nagyobbat dobni.");
  }
  //Mennyi a prímek összege a és b vagy b és a zárt intervallumban?
  private static int metódus2(int a, int b) {
    int összeg = 0;
    for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
      if (Prímszámok.prím(i))
        összeg += i;      
    }
    return összeg;
  }
  //HA adott hónap aktuális évben adott nappal kezdődik, 
  //AKKOR írja ki h az adott hónapban mely napok esnek adott napra!
  private static void metódus3(int szám, String szöveg) {
    //be: 3. hó 1. napja hétfő  : 1, 8, 15, 22, 29
    //be: 2. hó 1. napja ...    : 1, 8, 15, 22(,29) //nem szökőév (szökőév)
    //Először döntsük el h aktuális év adott hónapja...
    final String[] napnevek = {"", //most nem használjuk a 0. indexű elemet
      "hétfő","kedd","szerda", "csütörtök","péntek","szombat","vasárnap"};
    int napsorszám = 1;
    while (!(napnevek[napsorszám]==szöveg)) //kiválasztás tétel
      napsorszám++;
    int ideiév = new GregorianCalendar().get(Calendar.YEAR);
    boolean jóév = napsorszám==hétnapja(ideiév,szám,1); //csak az a jó év, ami
    if (!jóév) {
      System.out.println("Sajnos idén "+szám+". hónap első napja nem "+szöveg
        +", ezért a feladat megoldása itt véget is ér.");
      return; // :)
    }
    else {
      int[] hónapNapokszáma 
              = { 0,  //most nem használjuk a 0. indexű elemet
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//      ideiév--;
      if (Year.of(ideiév).isLeap()) // a szökőév() metódus, másképpen
        hónapNapokszáma[2] = 29;
      System.out.println("Az idei "+szám+". hónapban "+szöveg+"i napra esik még: ");
      for (int i = 1; i <= hónapNapokszáma[szám] ; i+=7) {
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    metódus1(100);
    System.out.println(metódus2(200, 300));
//    metódus3(3, "hétfő");
//    metódus3(12, "csütörtök");
      metódus3(2, "hétfő");
  }
  
  private static int hétnapja(int év, int hó, int nap) { //hó: 1..12, nap: 1..28/29/30/31
    Calendar myCalendar = new GregorianCalendar(év, hó-1, nap);
    int napsorsz;
    return 1<(napsorsz=myCalendar.get(Calendar.DAY_OF_WEEK)) ? napsorsz-1 : 7; 
    //HU locale: 1: hétfő, 7: vasárnap
    //BE: 1: vasárnap, 2: hétfő, 3: kedd, ..., 7: szombat
    //KI: 1: hétfő, 2: kedd, ..., 6: szombat, 7: vasárnap
  }
}
