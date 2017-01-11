// Alkalom06_nov27V
package alapcsomag;

public class Végjeles {
  public static void main(String[] args) {
    
    final int VÉGJEL = 0;
    int db = 0;
    int összeg = 0; //ebben adjuk össze a beolvasott értékeket!
    int max = 
            0;
//            Integer.MIN_VALUE; //kihasználjuk h informatikusok vagyunk
    int a;
    boolean vanÖt = false;
    System.out.println("Számok összege, átlaga '"+VÉGJEL+ "' végjelig");
    while ((a = extra.Console.readInt(db+1+". szám= ? ")) != VÉGJEL) {
      //feldolgozás
//      legnagyobb = (legnagyobb < a) ? a : legnagyobb;
      //az Integer.MIN_VALUE használata nélkül így kell
      //(pl adatbázis esetében) :
      vanÖt |= (a == 5);
      if (db > 0) { //ha már nem a legelső bevitelnél járunk 
        if (a > max)
          max = a;
      }
      else
        max = a; //legelső bevitel esetén
      //a fenti helyett írhatnánk: 
      /*
      if (db == 0 || a > max) 
        max = a; */
      //
      összeg += a;
      db++;
    }
    if (db>0) {
      double átlag = (double)összeg / db; //_számláló_ sose lehet 0
      System.out.println("Vége.\n"+db+" db adat érkezett. "
              + "Az adatok összege: "+összeg
              + ", átlaga: " + extra.Format.left(átlag, 0, 2)
              + ", a legnagyobb szám: " + max
      );
      System.out.println("Volt-e 5 a számok között: " 
              + (vanÖt ? "" : "nem ") + "volt.");
    }
    else
      System.out.println("Nem érkezett adat.");
  
  }
       
  public static void main4(String[] args) {
    final int VÉGJEL = 0;
    int db = 0;
    int összeg = 0; //ebben adjuk össze a beolvasott értékeket!
    int a;
    System.out.println("Számok összege, átlaga '"+VÉGJEL+ "' végjelig");
    while ((a = extra.Console.readInt(db+1+". szám= ? ")) != VÉGJEL) {
      //feldolgozás
      összeg += a;
      db++;
    }
    if (db>0) {
      double átlag = (double)összeg / db; //_számláló_ sose lehet 0
      System.out.println("Vége.\n"+db+" db adat érkezett. "
              + "Az adatok összege: "+összeg
              + ", átlaga: " + extra.Format.left(átlag, 0, 2));
    }
    else
      System.out.println("Nem érkezett adat.");
  }
  
  public static void main3(String[] args) {
    final int VÉGJEL = 0;
    int számláló = 0;
    int a;
    System.out.println("Számok beolvasása '"+VÉGJEL+ "'végjelig");
    while ((a = extra.Console.readInt(számláló+1+". szám= ? ")) != VÉGJEL) {
      //feldolgozás
      számláló++;
    }
    System.out.println("Vége.\n"+számláló+" db adat érkezett.");
  }
  
  public static void main2(String[] args) {
    final int VÉGJEL = 0;
    int számláló = 0;
    int a;
    boolean ok = false;
    System.out.println("Számok beolvasása '"+VÉGJEL+ "'végjelig");
    do {
      a = extra.Console.readInt((számláló+1) + ". szám = ? ");
      számláló += (ok = (a != VÉGJEL)) ? 1 : 0; //csak jó adat esetén manipulálhatjuk a számlálót
    } while (ok);
    System.out.println("Vége.\n"+számláló+" db adat érkezett.");
  }
}
