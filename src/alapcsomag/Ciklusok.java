// Alkalom04_nov22K
package alapcsomag;

public class Ciklusok {

  public static void main4(String[] args) {
    System.out.println("Hány szjegyből áll a szám?");
    int szám = extra.Console.readInt("szám = ? ");
    int szám2 = szám; //jegyezzük meg és dolgozzunk a másolattal!
    int db = 0;
    do {
      szám2 /= 10;
      db++;
    } while (szám2 != 0);
    System.out.println(db + " db sz.jegyből áll a szám.");
  }

  public static void main(String[] args) {
    int maxSor = 30, maxOszlop = 10;
    int számjegyDbMaxOszlop = 0, maxOszlop2 = maxSor * maxOszlop;
    do {
      maxOszlop2 /= 10;
      számjegyDbMaxOszlop++;
    } while (maxOszlop2 != 0);

    System.out.println("SZORZÓTÁBLA");
    //fejléc:
    System.out.print("   |");
    for (int oszlop = 1; oszlop <= maxOszlop; oszlop++) {
      System.out.print(extra.Format.right(oszlop, számjegyDbMaxOszlop + 1));
    }
    System.out.print("\n---|");
//    for (int oszlop = 1; oszlop <= maxOszlop; oszlop++) {
//      System.out.print(extra.Format.right("----", számjegyDbMaxOszlop + 1));
      for (int oszlop = 1; oszlop <= maxOszlop * (számjegyDbMaxOszlop+1); oszlop++) {
        System.out.print("-");
    }
    System.out.println();
    //szorzótábla:
    for (int sor = 1; sor <= maxSor; sor++) {
      System.out.print(extra.Format.right(sor, 3) + "|");
      for (int oszlop = 1; oszlop <= maxOszlop; oszlop++) {
        System.out.print(extra.Format.right(sor * oszlop, számjegyDbMaxOszlop + 1));
      }
      System.out.println();
    }
  }

  public static void main3(String[] args) {
    int //            a=5, b=15, 
            a = 7, b = 10, //tfh. OK, a<=b
            tipp = 0; //nem kötelező, de tanácsos
    System.out.println("Véletlenszám " + a + " és " + b + " között:");
    if (a == b && !(0 == a % 2)) //ha a==b és nem egyezik a párosság
    {
      System.out.println("Nincs ilyen szám.");
    } else {
      boolean páros;
      do {
        tipp = (int) (Math.random() * (b - a + 1) + a);
        páros = tipp % 2 == 0;
      } while (!páros);
      System.out.println(tipp);
    }
  }

  public static void main2(String[] args) {
    System.out.println("Számok 1-től 20-ig:");
//    for (int i = 20; i >=1 ; i--) {
//      System.out.print(21-i+" ");
//    }
//    for (int i = 1; i < 20; i+=2) {
//      System.out.print(i+" "+(i+1)+" ");
//    }
/*
    int szám=1;
    while(szám<=20) {
//      System.out.print(szám+" ");
//      szám++;
//      }
      System.out.print(szám+++" ");
     */
//      int szám=0;
//      while(szám<20) {
//      System.out.print(++szám+" ");

//      int szám=1;
//      while(szám<=20) {
//        szám--;
//        System.out.print((++szám-1)+" ");
//        szám++;
//      }
//      System.out.println(20);
//      
    int i = 1;
    do {
      System.out.print(i++ + " ");
    } while (i <= 20);
    System.out.println();
    //
  }
  //TODO: házi: 6. fejezet
}
