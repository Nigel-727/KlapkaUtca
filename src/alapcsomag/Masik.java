// Alkalom01_nov15K
package alapcsomag;

public class Masik {
  public static void main(String[] args) {
    System.out.print("EGYIK ");
    System.out.println("és a másik.");
    System.out.println( 13 == 13 );
    System.out.println( 14 < 13 );
    System.out.print( "" + true + false + '\n');
    System.out.println( true + "" + false );
    System.out.println("23" + 34 + (9-2) + 'c' + 9/4 + (9/2.0));
    System.out.println(10/3 + " " + 10%3);
    System.out.println(1 + 'A'); //számmá fog alakulni az 'A', az ASCII szerint
    System.out.println(Math.PI);
    System.out.println(5e2);
    System.out.println((int)5e2);
    System.out.println(9/7);
    System.out.println(9.0 / 7);
    System.out.println(9 / 7.0);
    System.out.println((double) (9 / 7)); //eső után köpönyeg
    System.out.println((double) 9 / 7);            
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE + 1);
    System.out.println((long)Integer.MAX_VALUE +1);
    System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
    System.out.println(2147483647L); //long
    
    //return 0;
  }
  
}
