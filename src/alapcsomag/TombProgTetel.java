// Alkalom09_dec3Sz + dec6K + dec8Cs
package alapcsomag;

import java.util.Arrays;

public class TombProgTetel {
  
  private static int[] tömb = null; //nullreferencia (!: akkor is null ha nincs odaírva)
  private static int összeg3 = 0, index = 0;

  private static void kategorizálás3() {
    Arrays.sort(tömb);
    int alsóHatár = 10, felsőHatár = 19, i = 0;
    while (i<tömb.length) {
      int db = 0;
      while (i<tömb.length &&
              alsóHatár<=tömb[i] && tömb[i]<=felsőHatár) {
        db++;
        i++;        
      }
      if (0 < db) 
        System.out.println(alsóHatár+"-"+felsőHatár+": "+db+" db");
      alsóHatár+=10; 
      felsőHatár+=10;
    }
    /*
    while (felsőHatár <= 99) {
      int aktSzám = tömb[i];
      while (felsőHatár <= 99 
              && alsóHatár<=tömb[i] && tömb[i]<=felsőHatár) {
        i++;
      }
      alsóHatár += 10;
      felsőHatár += 10;
    }*/
  }
  
  private static void kategorizálás2() {
    int alsóHatár = 10 /*, felsőHatár = 19*/;
    while (alsóHatár+9 <= 99) {
      int db = intervallumDb(alsóHatár, alsóHatár+9);
      if (0 < db) {
        System.out.println(
                alsóHatár+"-"+(alsóHatár+9)
                        +": "+db+" db");
      }
      alsóHatár += 10;
    }
  }
  
  private static int intervallumDb(int a, int b) {
//    return (int)(Math.random()*3); //kezdetben
    int db = 0;
    for (int i = 0; i < tömb.length; i++) {
      if (a<=tömb[i] && tömb[i]<=b)
        db++;
    }
    return db;
  }
  
  private static void kategorizálás1() {
    //kell az átlag:
    int összeg = 0, db = 0;
    for (int i = 0; i < tömb.length; i++) {
      összeg += tömb[i];      
      db++;
    }
    double átlag = (double)összeg/db;
//    System.out.println(átlag);
    double középsőAlsóHatár = átlag * 0.8, // átlag-20%
            középsőFelsőHatár = átlag * 1.2; // átlag+20%
    System.out.print("olcsó termékek árai: ");
    for (int i = 0; i < tömb.length; i++) {
      if (tömb[i] < középsőAlsóHatár)
        System.out.print(tömb[i]+" ");
    }
    System.out.println("");
    System.out.print("átlag (" + extra.Format.left(átlag, 0, 2)
            + ") körüli (+/-20%) termékek árai: ");
    for (int i = 0; i < tömb.length; i++) {
      if (középsőAlsóHatár <= tömb[i] &&
              tömb[i] <= középsőFelsőHatár)
        System.out.print(tömb[i]+" ");
    }
    System.out.println("");
    System.out.print("drága termékek árai: ");
    for (int i = 0; i < tömb.length; i++) {
      if (középsőFelsőHatár < tömb[i])
        System.out.print(tömb[i]+" ");
    }
    System.out.println("");
  }
  
  private static void csoportosmegszámolás2() { //rendezett sorozaton (tömbön)
    int[] tömb2 = new int[tömb.length]; //másolat
    for (int i = 0; i < tömb2.length; i++) 
      tömb2[i] = tömb[i];
    Arrays.sort(tömb2); //class Array, method sort() ; növekvőbe rendez; MUSZÁJ
//    System.out.println("min: "+tömb2[0]);
//    System.out.println("max: "+tömb2[tömb2.length-1]);
//    for (int i = 0; i < tömb2.length; i++) 
//      System.out.print(tömb2[i]+" ");
//    System.out.println();
    System.out.println("---------------------------------");
    //#1 (of #5):
    int i = 0, 
            csoportDb = 0; //ha azt is tudni akarom hány csoport van
    while (i<tömb2.length) {
      //#2
      int aktSzám = tömb2[i];
      System.out.print(aktSzám+": ");
      int csoportElemDb = 0;
      while (i<tömb2.length && tömb2[i]==aktSzám) {
        //#3
        csoportElemDb++;
        i++; //i-t szokás a legvégére hagyni (léptetés)
      }
      System.out.println(csoportElemDb+" db");
      //#4
      csoportDb++;
    }
    //#5
    System.out.println("Csoportok száma: "+csoportDb);
  }
  
  private static void csoportosmegszámolás1() { //nem rendezett sorozaton (tömbön)
    int min = tömb[0] , max = tömb[0];
    for (int i = 1; i < tömb.length; i++) {
      if (tömb[i] < min) 
        min = tömb[i];
      if (tömb[i] > max) 
        max = tömb[i];
    }
    int db = max - min + 1;
    int[] dbTömb = new int[db];
    for (int i = 0; i < dbTömb.length; i++) 
      dbTömb[i] = 0;
    for (int i = 0; i < tömb.length; i++)
      dbTömb[tömb[i]-min]++; //TODO: felfogni + miért nem működik jól?
    for (int i = 0; i < dbTömb.length; i++)
      if (dbTömb[i] > 0)
        System.out.println((i+min)+": "+dbTömb[i]+" db");
  }
  
  private static int[] tömbFeltölt() {
    //15-20 db elem, 2-jegyű pozitív számok
    int elemDb = (int)(Math.random()*6+15);
//    int elemDb = (int)(Math.random()*6+1);
//    int elemDb = 15;
    int[] t = new int[elemDb]; //itt dől el a méret
    for (int i = 0; i < t.length; i++) {
      t[i] = (int)(Math.random()*90+10);
//      t[i] = (int)(Math.random()*20);s
//      t[i] = (int)(Math.random()*1+12); //a 12-es szám
//      t[i] = (int)(Math.random()*20);
    }
//    return null; //időt nyerünk (kezdetben)
    return t;
  }
  
  private static void tömbLista() { //"sorozatszámítás/kiírás" p.t.
//void-ba nem muszáj return; szeparátor: ,
    System.out.println("A tömbelemek: ");
    for (int i = 0; i < tömb.length-1; i++) {
      System.out.print(tömb[i]+", ");
    }
    System.out.println(tömb[tömb.length-1]);
    System.out.println(tömb.length+" db elem volt.");
    
  }
  
    private static int összeg() { //"sorozatszámítás/összegzés" programozási tétel
    int összeg = 0;
//    for (int i = 0; i < tömb.length; i++) {
//      összeg += tömb[i];
//    }
    for (int elem: tömb) //...for ciklus 
      összeg += elem;
    return összeg;
//    return 0; //kezdetben, időnyerésre
  }
  private static int összeg2(int n) { //rekurzívan
    if (n==0) 
      return tömb[0];
    return tömb[n] + összeg2(n-1);
  }
  
  private static int összeg2() { //kifelé ezt ajánljuk meghívásra; meghívja a rekurzív metódust
    return összeg2(tömb.length-1);
  }
  
  private static int összeg3() { //rekurzió, ezúttal static változókkal
    if (index == tömb.length-1) //ezúttal az elejéről indulunk, így az utolsó elem a "triviális eset"
      return összeg3 += tömb[index]; 
    összeg3 += tömb[index++];
    return összeg3(); 
  }

  private static void eldöntés1() {
    System.out.print("Van-e 54 a tömbben? ");
    int i = 0; //hogy túlélje a ciklust
    for (; i < tömb.length; i++) {
      if (tömb[i] == 54)
        break; //vállalhatatlanul ronda megoldás
    }
    if (i >= tömb.length)
      System.out.println("Nem, nincs.");
    else
      System.out.println("Igen, van.");
  }
  
  private static void eldöntés2() {
    System.out.print("Van-e 54 a tömbben? ");
    int i = 0; //
    while (i<tömb.length //NE for ciklust használjunk "eldöntés" tételre, bár bevenné a fordító
            && !(tömb[i]==54)) //&& kell!; 
//      while (i<tömb.length & !(tömb[i]==54)) //&: baj van, "ArrayIndexOutOfBoundsException"
      i++;
    //boolean van = i<tömb.length; //másféle megoldás
    System.out.println(i < tömb.length ? "Igen, van." : "Nem, nincs.");
  }
  
  private static void eldöntés3() {
    System.out.print("Van-e prímszám a tömbben? ");
    int i = 0; //
    while (i<tömb.length 
          && !Prímszámok.prím(tömb[i])
            )       
      i++;
    boolean van = i<tömb.length; //másféle megoldás
    System.out.println(van ? "Igen, van." : "Nem, nincs.");
  }
  
  private static void kiválasztás() { //nem az a kérdés, van-e, hanem h MELYIK
    System.out.println("Melyik a(z első) páros tömbelem? ");
    int i = 0;
    while (!(0==tömb[i]%2)) //!: mivel KIVÁLASZTÁS tétel, ezért nincs indexellenőrzés
      i++;
    System.out.println("A(z első) indexe: "+i);
  }
  
  private static void keresés1() { //ha fv. lenne akkor boolean + érték párost kellene visszaadnia (van-e, melyik) = eldöntés+kiválasztás
    System.out.println("Van-e 25 és ha igen, melyik az első? ");
    int i = 0;
    while (i<tömb.length && !(tömb[i]==25))
      i++;
    boolean van = i<tömb.length;
    if (van)
      System.out.println("A(z első) indexe: "+i); //nem csak a tényt közlöm, hanem a túlélő következményváltozót is kiíratjuk
    else
      System.out.println("Nem, nincs.");
  }
  
  private static void keresés2() {
    //van-e prímszám a tömbben s ha igen, melyik az első
  }
  
  private static void megszámolás1() { //"hány olyan van ami t tulajdonságú?"
    System.out.println("Hány db 35 van a tömbben? ");
    int db = 0;
    for (int i = tömb.length-1; 0 <= i; i--) {
      if (tömb[i] == 35)
        db++;
    }
    System.out.println(db+" db");
  }
  
  private static void megszámolás2() {
    System.out.println("Hány db 10-zel osztható van? ");
    int db = 0;
    for (int i = tömb.length-1; 0 <= i; i--) 
      if (tömb[i] % 10 == 0) //ezt másképpen is lehetne írni: lásd: alapműveletekgyakoroltatása.java
        db++;
    System.out.println(db+" db");
  }
  
  private static void legnagyobb1() { //nem az a kérdés, van-e, hanem h melyik
    int maxHely = 0; //a "választási ígéret" :)
    for (int i = 1; i < tömb.length; i++) 
      if (tömb[maxHely] < tömb[i]) //<= esetén viszont a legutolsó indexét keressük
        maxHely = i;
    System.out.println("Hol van a(z első) legnagyobb? "
            +maxHely+" indexen.");
  }
  
  private static void legnagyobb2() {
    int maxHely = 0;  //nekem ez a megoldás tetszik leginkább
    for (int i = 1; i < tömb.length; i++) {
      if (tömb[maxHely] < tömb[i]) //<= esetén viszont a legutolsó indexét keressük
        maxHely = i;
    }
    System.out.println("Mennyi a legnagyobb tömbérték? "
            +tömb[maxHely]+"");
  }
  
  private static void legnagyobb3() {
    int maxÉrték = tömb[0]; 
    for (int i = 1; i < tömb.length; i++) {
      if (maxÉrték < tömb[i]) //<= esetén viszont a legutolsó indexét keressük
        maxÉrték = tömb[i];
    }
    System.out.println("Mennyi a legnagyobb tömbérték? "+
            maxÉrték+"");
  }
  
  private static void kiválogatás() {
    System.out.print("Mennyi a páros tömbelemek összege? ");
    int párosDb = 0;
    for (int i = 0; i < tömb.length; i++) 
      if (tömb[i]%2 == 0)
        párosDb++;
    if (0==párosDb)
      System.out.println("Nincs összeg, mert nincs páros tömbelem sem.");
    else { //azért kell a külön lépés h ne foglaljuk feleslegesen a memóriát
      int[] párosTömb = new int[párosDb];
      int párosIndex = 0;
      for (int i = 0; i < tömb.length; i++) 
        if (0 == tömb[i]%2)
          párosTömb[párosIndex++] = tömb[i];
//      System.out.println("A páros tömbelemek: ");
//      for (int i = 0; i < párosTömb.length; i++) {
//        System.out.print(párosTömb[i]+" ");
//      }
//      System.out.println();
      int párosÖsszeg = 0;
      for (int i = 0; i < párosTömb.length; i++) 
        párosÖsszeg += párosTömb[i];
      System.out.println(párosÖsszeg);
    }
  }
  
  public static void szétválogatás() {
    int prímDb = 0;
    for (int i = 0; i < tömb.length; i++) 
      if (Prímszámok.prím(tömb[i]))
        prímDb++;
    int[] prímTömb = new int[prímDb]; //j-vel indexeljük!
    int[] nemPrímTömb = new int[tömb.length-prímDb]; //k-val!
    int j=0, k=0;
    for (int i = 0; i < tömb.length; i++) 
      if (Prímszámok.prím(tömb[i]))
        prímTömb[j++] = tömb[i];
      else
        nemPrímTömb[k++] = tömb[i];
    //*
    System.out.println("Prímek listája: ");
    for (int i = 0; i < prímTömb.length; i++) 
      System.out.print(prímTömb[i]+" ");
    System.out.println();
    System.out.println("Nem prímek listája: ");
    for (int i = 0; i < nemPrímTömb.length; i++) 
      System.out.print(nemPrímTömb[i]+" ");
    System.out.println();
  }
  
  private static void másolás() {
    int[] segédTömb = new int[tömb.length];
//    segédTömb = tömb; //ez a ROSSZ megoldás; !: memóriacímek közötti értékadás történt
//    segédTömb[0] = 100; //valójában a tömb[0] kapja az értéket
//    tömbLista();
    for (int i = 0; i < tömb.length; i++) 
      segédTömb[i] = tömb[i];
    System.out.println("Másolat: ");
    for (int i = 0; i < segédTömb.length; i++) 
      System.out.print(segédTömb[i]+" ");
    System.out.println();
//    segédTömb[0] = -2; //ez már nem változtat a tömb-ön
//    tömbLista();
  }
    
  public static void main(String[] args) {
    tömb = tömbFeltölt(); //a metódus dönti el a méretét is!
    tömbLista();
/*
    System.out.println("A tömbelemek összege: "+összeg());  //iterációval
    System.out.println("A tömbelemek összege: "+összeg2()); //rekurzióval
    System.out.println("A tömbelemek összege: "+összeg3()); //emiatt vezetjük be: static int összeg3, index
    eldöntés1();
    eldöntés2();
    eldöntés3(); //prím-e
    kiválasztás();
    keresés1();
    keresés2(); //az első prímet
    megszámolás1();
    megszámolás2();
    //szélsőérték kiválasztás:
    legnagyobb1();
    legnagyobb2();
    legnagyobb3();
    //kiválogatás p. tétel
    kiválogatás();
    szétválogatás();
    másolás();
    csoportosmegszámolás1();
    csoportosmegszámolás2();
    kategorizálás1();
    kategorizálás2();
*/
    kategorizálás3();
  }
}