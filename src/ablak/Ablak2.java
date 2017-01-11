package ablak;

import javax.swing.JFrame;

/**
 *
 * @author Nigel-727
 */
public class Ablak2 extends JFrame {
  
  public Ablak2() { 
//    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("CímSOR");
    setSize(300,200); //FONTOS a...
    setLocationRelativeTo(this); //...SORREND!
    
    
    
    
    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new Ablak2();
  }
}
