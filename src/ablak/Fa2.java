package ablak;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Fa2 extends JFrame {
  
  public Fa2() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Fa");
    setSize(300, 300);
    faÉpít();
    setVisible(true);
  }
  private void faÉpít() {
    ArrayList<Integer> számLista = new ArrayList<>();
    for (int i = 1; i <= 20; i++)  //a feladatban: 100
      számLista.add((int)(Math.random()*900+100));
    Collections.sort(számLista);
//    System.out.println(számLista);
    DefaultMutableTreeNode 
            faGyökér = new DefaultMutableTreeNode("Szám");
    DefaultTreeModel 
            dtm = new DefaultTreeModel(faGyökér);
    //
    int aH=100, fH=aH+99; //általánosítható ötlet;
    int i=0;
    while (i<számLista.size()) {
      String faElemSzöveg = aH+"-"+fH+""; //de az még nem biztos h ki is íratjuk
      DefaultMutableTreeNode faElem = 
              new DefaultMutableTreeNode(faElemSzöveg);
      //Írjunk bele csúnyát (faLevél) :
//      DefaultMutableTreeNode faLevél = new DefaultMutableTreeNode(""); //ha () akkor null lesz, ezért kell a ""
      //megint csúnyát:
      ArrayList<Integer> kategóriaLista = new ArrayList<>();
      while (i<számLista.size() && aH<=számLista.get(i) && számLista.get(i)<=fH){
//        faElem.add( new DefaultMutableTreeNode(számLista.get(i)) ); //ez most (implicite) számlálja darabszámot is
//        faLevél.setUserObject( //aminek a toString()-je megjelenik; #mivan
//                faLevél.getUserObject()+" "+számLista.get(i)   );
        kategóriaLista.add(számLista.get(i));
        i++;
      }//while <belső>
//      if (!("".equals(faLevél.getUserObject())))             
//        faElem.add(faLevél);
//      if (!faElem.isLeaf())
      if (0<kategóriaLista.size()) {
        faElem.add(new DefaultMutableTreeNode(kategóriaLista));
        faElem.setUserObject(faElemSzöveg+" ("
//                +faElem.getChildCount()
                +kategóriaLista.size()
                +" db)");
        faGyökér.add(faElem);
      }
//      if (0<faElem.getChildCount()) //itt kérdezzük a "darabszámot"
//        faGyökér.add(faElem);
      aH+=100; fH=aH+99;
    }//while <külső>
    JTree tFa = new JTree(dtm); 
//    add(tFa);//helyett az alábbi ha csúszkát is akarunk:
    add(new JScrollPane(tFa));
  }
  
  private void faÉpít0() {
    DefaultMutableTreeNode 
            faGyökér = new DefaultMutableTreeNode("Járművek");
    DefaultMutableTreeNode 
            faSzemélyautók = new DefaultMutableTreeNode("Személyautók");
    faGyökér.add(faSzemélyautók);
    faSzemélyautók.add(new DefaultMutableTreeNode("Audi"));
    faSzemélyautók.add(new DefaultMutableTreeNode("Open"));
    faSzemélyautók.add(new DefaultMutableTreeNode("Volvo"));
    DefaultMutableTreeNode 
            faTeherautók = new DefaultMutableTreeNode("Teherautók");
    faGyökér.add(faTeherautók);
    faTeherautók.add(new DefaultMutableTreeNode("DAF"));
    faTeherautók.add(new DefaultMutableTreeNode("teherótó"));
    //
    DefaultTreeModel 
            dtm = new DefaultTreeModel(faGyökér);
//    JTree tFa = new JTree(dtm); //a modellt is meg lehet adni a konstruktorban
    JTree tFa = new JTree(); //De így is működne...
    tFa.setModel(dtm); //...bizony.
    add(tFa);
  }
  
  public static void main(String[] args) {
    new Fa2();
  }
}

//algoritmus ami csoportosít 10e-sével és fát épít belőle (zh1: csoportosít1,2,3 feladatok)
//csoportváltás 1. szinte: objektum, 2. szinte beledobálok
