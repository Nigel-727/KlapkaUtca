// Alkalom08_dec1Cs + dec6K
package alapcsomag;

public class Kockadobás {

  static final int ALAP = 10; 
//  static final int ALAP = 256; 
  
  public static void main(String[] args) {
    
    System.out.println("Kockadobás 2 kockával N-szer");
    int n = extra.Console.readInt("N=? ");
    int[][] dobásTömb = new int[6][6]; 
    for (int sor = 0; sor < dobásTömb.length; sor++) {
      for (int oszlop = 0; oszlop < dobásTömb[0].length; oszlop++) {
        dobásTömb[sor][oszlop] = 0;        
      }
    }
    for (int i = 1; i <= n; i++) {
      int dobás1 = (int)(Math.random()*6); //0..5
      int dobás2 = (int)(Math.random()*6); //0..5
      dobásTömb[dobás1][dobás2]++;
    }    
    for (int sor = 0; sor < dobásTömb.length; sor++) {
      for (int oszlop = 0; oszlop < dobásTömb[0].length; oszlop++) {
        System.out.print(
                extra.Format.right(dobásTömb[sor][oszlop], 6));
      }
      System.out.println();
    }
  
  }
  
  public static void main7(String[] args) {
    System.out.println("Kockadobás 2 kockával N-szer");
    int n = extra.Console.readInt("N=? ");
    int[][] dobásTömb = new int[6][6]; 
    for (int sor = 0; sor < dobásTömb.length; sor++) {
      for (int oszlop = 0; oszlop < dobásTömb[0].length; oszlop++) {
        dobásTömb[sor][oszlop] = 0;        
      }
    }
    for (int i = 1; i <= n; i++) {
      int dobás1 = (int)(Math.random()*6); //0..5
      int dobás2 = (int)(Math.random()*6); //0..5
      dobásTömb[dobás1][dobás2]++;
    }    
    for (int sor = 0; sor < dobásTömb.length; sor++) {
      for (int oszlop = 0; oszlop < dobásTömb[0].length; oszlop++) {
        System.out.print(
                extra.Format.right(dobásTömb[sor][oszlop], 6));
      }
      System.out.println();
    }
  }
  
  public static void main6(String[] args) {
    System.out.println("Kockadobás 2 kockával N-szer");
    int n = extra.Console.readInt("N=? ");
    int[] dobásTömb = new int[13]; //[0]: nem használjuk
    for (int i = 2; i <= 12; i++) {
      dobásTömb[i] = 0;
    }
    for (int i = 1; i <= n; i++) {
      int dobás1 = (int)(Math.random()*6+1);
      int dobás2 = (int)(Math.random()*6+1);
      dobásTömb[dobás1+dobás2]++;
    }
    for (int i = 2; i <= 12; i++) {
      System.out.print(
      extra.Format.right(i, 5));
    }
    System.out.println();
    for (int i = 2; i <= 12; i++) {
      System.out.print(extra.Format.right(dobásTömb[i], 5));
    }
    System.out.println();
  }
  
  public static void main5(String[] args) { //"(csoportosított) megszámolás" tétel
    System.out.println("Kockadobás 1 kockával N-szer");
    long n = extra.Console.readInt("N= ? "); //tfh. OK
    int[] dobásTömb = {0, 0, 0, 0, 0, 0}; //de vigyázzunk a túlindexeléssel!
    for (int i = 1; i <= n ; i++) { //a hivatkozásnál kompenzálok, a kommunikációnál nem kell
      int dobás = (int)(Math.random()*6+1); // 1..6
      dobásTömb[dobás-1]++;
    }
    for (int j = 1; j <= dobásTömb.length; j++) { //következetesen itt is
      System.out.println(
              j+" volt: "+dobásTömb[j-1]+" db");
    }
  }
  
  public static void main4(String[] args) {
    System.out.println("Kockadobás 1 kockával N-szer");
    long n;  //Célszerűen n/6 <= ALAP-1 //másképp írva: n < 6 * ALAP
    while ((n=extra.Console.readInt("N= ? "))<1)
      System.out.println("Csak pozitív egész számot fogadunk el!");
    long dobások = 0;
    for (int i = 1; i <=n ; i++) {
      int dobás = (int)(Math.random()*6+1); // 1..6
      dobások += Math.pow(ALAP, dobás-1); 
    /* pl 10 alap esetén
      dobás==1 : += 10(0) // 000001  
      dobás==2 : += 10(1) // 000010
      dobás==3 : += 10(2) // 000100
      dobás==4 : += 10(3) // 001000
      dobás==5 : += 10(4) // 010000
      dobás==6 : += 10(5) // 100000
    */
    }
    System.out.print(
            "A változó értéke: " + dobások );
    System.out.println(" ("+Long.toHexString(dobások)+"h)");
//    System.out.println(Long.toBinaryString(dobások)+"b");
    for (int i = 6; i >= 1; i--) {
      long hatvány;
      System.out.println(
            (i)+" volt: "+ 
            dobások / (hatvány=(long)Math.pow(ALAP,i-1)) //a hányados az aktuális 1. számjegy
      );
      dobások %= hatvány; //a maradék lesz az új osztandó
    }
  }
  
  public static void main3(String[] args) {
    System.out.println("Kockadobás 1 kockával N-szer");
    long n = extra.Console.readInt("N= ? ");
    long dobások = 0;
    for (int i = 1; i <=n ; i++) {
      int dobás = (int)(Math.random()*6+1); // 1..6
      switch (dobás) {
        case 1: dobások+=Math.pow(ALAP, 0); break;
        case 2: dobások+=Math.pow(ALAP, 1); break;
        case 3: dobások+=Math.pow(ALAP, 2); break;
        case 4: dobások+=Math.pow(ALAP, 3); break;
        case 5: dobások+=Math.pow(ALAP, 4); break;
        case 6: dobások+=Math.pow(ALAP, 5);
      }
    }
    System.out.println(
            "A változó értéke: " + dobások );
    System.out.println(Long.toHexString(dobások)+"h");
    System.out.println(Long.toBinaryString(dobások)+"b");
    System.out.println(
            "6 volt: " + dobások/(long)Math.pow(ALAP, 5)); //ALAP(hatvány)-nyal osztok
    dobások%=Math.pow(ALAP, 5); //ALAP(hatvány)-nyal maradékot képzek
    System.out.println(
            "5 volt: " + dobások/(long)Math.pow(ALAP, 4));
    dobások%=Math.pow(ALAP, 4);
    System.out.println(
            "4 volt: " + dobások/(long)Math.pow(ALAP, 3));
    dobások%=Math.pow(ALAP, 3);
    System.out.println(
            "3 volt: " + dobások/(long)Math.pow(ALAP, 2));
    dobások%=Math.pow(ALAP, 2);
    System.out.println(
            "2 volt: " + dobások/(long)Math.pow(ALAP, 1));
    dobások%=Math.pow(ALAP, 1); //ALAP-pal maradékot képzek, megkapom az utolsó helyiértéken lévő számjegyet
    System.out.println(
            "1 volt: " + dobások);
  }
  
  public static void main2(String[] args) {
    System.out.println("Kockadobás 1 kockával N-szer");
    long n = extra.Console.readInt("N= ? ");
    long db1 = 0, db2 = 0, db3 = 0, db4 = 0, db5 = 0, db6 = 0;
    for (int i = 1; i <=n ; i++) {
      int dobás = (int)(Math.random()*6+1); // 1..6
      switch (dobás) {
        case 1: db1++; break;
        case 2: db2++; break;
        case 3: db3++; break;
        case 4: db4++; break;
        case 5: db5++; break;
        case 6: db6++;
      }
    }
    System.out.println(
            "1-es volt: " + db1
            +"\n2-es volt: "+db2
            +"\n3-as volt: "+db3
            +"\n4-es volt: "+db4
            +"\n5-ös volt: "+db5
            +"\n6-os volt: "+db6 );
  }
}
