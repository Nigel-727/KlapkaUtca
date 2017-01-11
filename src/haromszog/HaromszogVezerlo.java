package haromszog;

import java.util.Arrays;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */

public class HaromszogVezerlo {
  public static void main(String[] args) {
    Haromszog[] hTömb = new Haromszog[15];
    int a, b, c;
    System.out.println("A háromszögek:");
    for (int i = 0; i < hTömb.length; i++) {
      a=10; //a=100 kivételhez vezet
      b=(int)(Math.random()*11+10); //10-20
      c=(int)(Math.random()*7+12); //12-18
      hTömb[i] = new Haromszog(a, b, c);
//      System.out.println(hTömb[i]);
    } //for
    System.out.println("A háromszögek sorrendben (terület alapján):");

    for (int i = 0; i < hTömb.length-1; i++) {
      for (int j = i+1; j < hTömb.length; j++) {
        if (hTömb[i].terület() > hTömb[j].terület()) {
//          if (hTömb[i].kerület() > hTömb[j].kerület()) {
//        if (hTömb[i].compareTo(hTömb[j])>0) {
          Haromszog csere = hTömb[i];
          hTömb[i] = hTömb[j];
          hTömb[j] = csere;
        } 
      }
    }
//    for (int i = 0; i < hTömb.length; i++) 
//      System.out.println(hTömb[i]);

//    Arrays.sort(hTömb); //a Comparable interfész szerint rendez! 
    for (Haromszog h : hTömb)
      System.out.println(h);
/*
    //
    int i=0;
    double teruletÖsszeg = 0;
    while (i<hTömb.length) 
      teruletÖsszeg+=hTömb[i++].terület();
    double teruletÁtlag = teruletÖsszeg/hTömb.length;
    System.out.println("Területek átlaga: "
            + teruletÁtlag);
    //
    int kisebbAtlagDb = 0;
    for (Haromszog h : hTömb) 
      if (h.terület() < teruletÁtlag) 
        ++kisebbAtlagDb;
    Haromszog[] kisebbAtlagHTomb = new Haromszog[kisebbAtlagDb];
    Haromszog[] tobbiAtlagHTomb = new Haromszog[hTömb.length-kisebbAtlagDb];
//    System.out.println("Ezitt: "+kisebbAtlagHTomb[0].terület());
    i = 0; int j = 0;
    for (Haromszog h : hTömb) 
      if (h.terület() < teruletÁtlag) 
        kisebbAtlagHTomb[i++] = h;
      else
        tobbiAtlagHTomb[j++] = h;
    System.out.println("A területátlagnál kisebb területű háromszögek:");
    for (Haromszog haromszog : kisebbAtlagHTomb) {
      System.out.println(haromszog);
    }
    System.out.println("A kisebb elemek száma: " + kisebbAtlagHTomb.length);
    System.out.println("A területátlagnál nagyobb= területű háromszögek:");
    for (Haromszog haromszog : tobbiAtlagHTomb) {
      System.out.println(haromszog);
    }
    System.out.println("A nagyobbegyenlő elemek száma: " + tobbiAtlagHTomb.length);
    System.out.println("Biztosan megvan mindegyik? "
            + (kisebbAtlagHTomb.length 
                    + tobbiAtlagHTomb.length == hTömb.length ? "igen" : "nem"));
*/
    int i = 0; int db;
    while (i<hTömb.length) {
      db = 0;
      int aktKer = hTömb[i].kerület();
      System.out.print(aktKer + "\t");
      while (i<hTömb.length && aktKer == hTömb[i].kerület()) {
        i++;
        db++;
      }
      System.out.println(db + " db");
    }
  } //main()
  
  public static void main2(String[] args) {
    Haromszog h1 = new Haromszog(5, 4, 3);  //OK
//    Haromszog h1 = new Haromszog(3, 4, 7); //hibás; 0.0
//    Haromszog h1 = new Haromszog(3, 4, 8); //hibás; NaN
    Haromszog h2 = new Haromszog(3, 5, 4);
//    Haromszog h2 = new Haromszog(3, 5, 5);
    System.out.println(h1);
//    System.out.println(h1.toString());
//    System.out.println(h1.a); //obfuszkátor nevű prg
//    System.out.println(h1.getA());
    System.out.println(h2);
//    System.out.println("kerület: "+h1.kerület());
//    System.out.println("terület: "+h1.terület());
    System.out.println("Megegyezik-e a két háromszög? "
            + (h1.equals(h2)?"Igen.":"Nem."));
    System.out.println(
        h1.compareTo(
                h2)<0 ? "h1 kisebb h2-nél"
                : h1.compareTo(h2)==0 ? "h1 = h2"
                : "h1 nagyobb h2-nél");
  } //main
} //class