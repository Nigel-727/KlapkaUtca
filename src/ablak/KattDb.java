package ablak;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;



public class KattDb extends JFrame implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int szám = Integer.parseInt(btKatt.getText());
    szám++;
    btKatt.setText(""+szám);
    
  }
  
  private JButton btKatt = new JButton("0");
  
  public KattDb(String címsor) {
    super(címsor);
    setSize(200, 200);
//    setLayout(new FlowLayout());
    setLayout(new BorderLayout());
    btKatt.setFont(new Font("Arial", Font.BOLD, 40));
    btKatt.setForeground(Color.BLUE);
    add(btKatt, BorderLayout.PAGE_START);
    btKatt.addActionListener(this);
    
  }
  
  public static void main(String[] args) {
    new KattDb("").setVisible(true);
  }
}
