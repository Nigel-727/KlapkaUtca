package ablak;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ablak1 {
  public static void main(String[] args) {
    JFrame ablak = new JFrame();
//    ablak.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ablak.setVisible(true);
    ablak.setTitle("cÍmsOr");
    Dimension ablakMéret = new Dimension(300, 200);
    ablak.setSize(ablakMéret);
//    ablak.setSize(300, 200); //1+gyök5/2 aranymetszés
    
    ablak.setResizable(false); //az a tendencia h összes tulajdonságot beállítom, 1) láthatatlanok 2) láthatóak 3) ...
    Dimension képernyőméret = Toolkit.getDefaultToolkit().getScreenSize();
/*
    ablak.setLocation(
            new Point((képernyőméret.width-ablakMéret.width)/2,
            (képernyőméret.height-ablakMéret.height)/2)
    );
*/
    ablak.setLocationRelativeTo(ablak);
//    ablak.setUndecorated(true); //a SZEGÉLYT szedi le
    ablak.add(new JLabel("Helló világ!"));
//    ablak.setLocation(200, 100);
//    Toolkit.getDefaultToolkit().getImage(filename) //lecserélni a kávé ikont
    System.out.println(képernyőméret);
    
    
    
    
    ablak.setVisible(true); //ezután már azokat állítjuk be ami nem hat a látványra:
  }
}
