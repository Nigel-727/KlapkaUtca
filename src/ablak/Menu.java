package ablak;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Menu extends JFrame {
  private JRadioButtonMenuItem rbmiNyomtatásiKép = null,
           rbmiVázlatNézet = null;
  private JMenu mMegjelenít = new JMenu("Megjelenít");
  
  public Menu(String felirat) {
//    settitle() vagy pedig:
    super(felirat);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(300, 200);
    menüÉpít();
    //ezután kitaláltunk egy kis betoldást:
    setLayout(new FlowLayout());
    JButton btÁllapot = new JButton("Állapot");
    add(btÁllapot);
    btÁllapot.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Nyomtatási kép: "+rbmiNyomtatásiKép.isSelected());
        System.out.println("Vázlat nézet: "+rbmiVázlatNézet.isSelected());
      }
    });
    //
  }
  
  private void menüÉpít() {
    final JFrame ABLAK = this; //ez a fc.showOpenDialog(...) miatt kellett!!
    JMenuBar mb = new JMenuBar(); //mb lehet mert úgyis csak 1et csinálok most
    setJMenuBar(mb); //!: nem pedig setMenuBar(mb); ez kell h ne tehesse ki akárhová, pl a BorderLayout.CENTER-be
    JMenu mFájl = new JMenu("Fájl"); //szöveges komment amit nem értettem
    mb.add(mFájl); //tulajdonosi (tartalmazási) hierachiát építek a menüben
    JMenuItem miMegnyit = new JMenuItem("Megnyit..."); //képet (Icon), akcióeseményt, stb kaphat a konstruktorában
    mFájl.add(miMegnyit); //az mFájl konténerébe bedobjuk e menüitemet
    miMegnyit.addActionListener(new ActionListener() { //névtelen ojjektum indul...
      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser fc = new JFileChooser(); //!: nem relatív, hanem abszolút útvonalat vár
        fc.showOpenDialog(ABLAK); //ABLAK: az ő tulajdonosa, aminek vissza kell adnia a fókuszt bezárás után
      }
    }); //...névtelen ojjektum vége.
    mFájl.addSeparator(); //szeparátor legalul nem lehet; szep. nem tud lenni fókuszban
    JMenuItem miKilép = new JMenuItem("Kilép");
    mFájl.add(miKilép);
    JMenu mSzerkeszt = new JMenu("Szerkeszt");
    mb.add(mSzerkeszt);
    rbmiNyomtatásiKép = 
            new JRadioButtonMenuItem("Nyomtatási kép"); //alapból hamis
    rbmiVázlatNézet = 
            new JRadioButtonMenuItem("Vázlat nézet", true);
    rbmiVázlatNézet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        menüJogosultságKezelő();
      }
    });
    rbmiNyomtatásiKép.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        menüJogosultságKezelő();
      }
    });
    ButtonGroup bgNézet = new ButtonGroup();
    bgNézet.add(rbmiVázlatNézet); //muszáj...
    bgNézet.add(rbmiNyomtatásiKép); //...és ez is muszáj, hogy csak egy lehessen egy időben kiválasztva.
    mSzerkeszt.add(rbmiVázlatNézet);
    mSzerkeszt.add(rbmiNyomtatásiKép);
    mSzerkeszt.addSeparator();
    mSzerkeszt.add(new JMenuItem("Teszt")); //amit nem szólíthatok meg soha (mert névtelen)
    //Legyenek új menük amik szürkék v sem attól függően h nyomt. vagy vázlatnézet van benyomva:
//    mMegjelenít.setEnabled(false);
    mb.add(mMegjelenít);
    mMegjelenít.add(new JMenuItem("Menü1"));
    mMegjelenít.add(new JMenuItem("Menü2"));
    mMegjelenít.add(new JMenuItem("Menü3"));
    menüJogosultságKezelő();
  }
  
  private void menüJogosultságKezelő() {
//    mMegjelenít.setEnabled(rbmiNyomtatásiKép.isSelected()); //ez volt eredetileg, de aztán hozzáírtuk ezt:
    for (Component c : mMegjelenít.getMenuComponents()) { //!: nem pedig getComponents()
      if (c instanceof JMenuItem)
        ((JMenuItem)c).setEnabled(rbmiNyomtatásiKép.isSelected());
      //minden olyan ojjekctumnak van getComponentse aminek van elrendezésmenedzsere; kivéve pl a menünek :)
    }
  }
  
  public static void main(String[] args) {
    new Menu("Menüüüüü!").setVisible(true);
  }
}
/*
Actionevent e; e.getSource().getParent() //#naezmicsoda

*/