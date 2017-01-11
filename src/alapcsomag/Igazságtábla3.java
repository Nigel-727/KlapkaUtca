// Alkalom03_nov19Sz
package alapcsomag;

public class Igazságtábla3 {
  public static void main(String[] args) {
    System.out.println("A kizáró vagy művelet igazságtáblája"+
      "\na       b       a vagy b"+ 
      "\nfalse   false   "+(false^false)+ //igaz ha a kettő különbözik
      "\nfalse   true    "+(false^true)+ 
      "\ntrue    false   "+(true^false)+
      "\ntrue    true    "+(true^true)); //TODO: miért is kell a ()
    System.out.println("\nA (!kizáró vagy) igazságtáblája"+
      "\na       b       a vagy b"+ 
      "\nfalse   false   "+!(false^false)+ //igaz ha a kettő egyezik
      "\nfalse   true    "+!(false^true)+
      "\ntrue    false   "+!(true^false)+
      "\ntrue    true    "+!(true^true));
  }
}