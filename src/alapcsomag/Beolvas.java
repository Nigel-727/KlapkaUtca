// Alkalom02_nov17Cs

//import extra.*; //ez után írhatnék olyat pl h Console.readInt(); //vagyis, extra. nélkül
package alapcsomag;

public class Beolvas {

  public static void main5(String[] args) {
    int a;
    a = extra.Console.readInt("szám = ? ");
    int bb;
//    b = ++a++; //ez nem fordul le
//    b = ++a+1; //lefordul
//    b=++a; b++; //e kettő nem összevonható
    bb = a++ - ++a; //a=5: b = 5 - 7;
    bb = (a++) - (++a); //ez ugyanaz mint felette
    //
    bb = (++a) - (a++); //a megnövelt értékből vonja le a megnövelt értéket

    System.out.println("b= " + bb);
  }

  public static void main4(String[] args) {
    // = extra.Console.readInt("Írj be egy egész számot ide : ");
    //System.out.println(Integer.MAX_VALUE);
    System.out.println("TÉGLALAP kerülete, területe");
    int a, b;
    a = extra.Console.readInt("A = ");
    b = extra.Console.readInt("B = ");
    int kerület = 2 * (a + b), terület = a * b;
    System.out.println("K: " + kerület + "\nT: " + terület);
  }

  public static void main(String[] args) {
    System.out.println("6-tal osztható-e a szám?");
    int szám = extra.Console.readInt("Szám: ");
//    boolean hattal_e = (szám % 2 == 0) && (szám % 3 ==0);                        //1
//    boolean hattal_e = !(!(szám % 2 == 0) || !(szám % 3 ==0)); //ÉS = ! ( !a || !b )
    boolean hattal_e = !(szám%2!=0 || szám%3!=0); //és így is lehet
    System.out.println("6-tal osztható-e? " + hattal_e);
  }
}
