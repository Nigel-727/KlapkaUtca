package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOlvas {
  public static void main(String[] args) {
    File fájl = new File("./számlista.txt");
    if (fájl.exists()) {
      BufferedReader br = null;
      int összeg=0;
      try {
        br = new BufferedReader(new FileReader(fájl)); //#csodaszép; dobhat: FileNotFoundException
        String sor;
        while ((sor=br.readLine())!=null) {
          sor = sor.trim(); //#juhé; leszedi az esetleges határoló whitespaceket
          System.out.println(sor);
          int szám = Integer.parseInt(sor);
          összeg+=szám;
        }
//        System.out.println("Az össszeg: "+összeg); //nem ide kell
      } catch (NumberFormatException e) {
        System.out.println("Hiba: fájl sorának feldolgozása közben.");
      } catch (FileNotFoundException e) { 
        System.out.println("Hiba: fájl megnyitás során."); //pl előzőleg word-ben megnyitom
      } catch (IOException e) { //a FileNotFoundException és IOException leszármazotti viszonyban vannak, azért OK így; ha mind2-t kezeljük akkor először a FileNot... utána az IOException
        System.out.println("Hiba: fájl olvasása során."); //pl lezárás előtt nyitom meg word-ben; #erőszakoffice
      } finally {
        try {
          br.close();
        } catch (IOException ex) {
  //        Logger.getLogger(FileOlvas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hiba: fájl lezárása során.");
        }
      }
      System.out.println("Az össszeg: "+összeg); 
    } else
      System.out.println("Nem létezik");
  }
}