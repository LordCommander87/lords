package guardians;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Splash extends JFrame
{
	private static JLabel lbSplash;
	private ImageIcon imSplash;
  
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700,300);
		setLocationRelativeTo(null);
		setVisible(true);
		ImageIcon icone = new ImageIcon("IconL.png");
		setIconImage(icone.getImage());
	     
		try {
			Thread.sleep (3000);
	    }
		catch (InterruptedException ex) {}
	    	dispose();
	  
	    setLayout(null);
     
	    imSplash = new ImageIcon("logoteste.png");
     
	    lbSplash = new JLabel(imSplash);
	    lbSplash.setBounds(0,0,700,300);
     
	    add(lbSplash);
  }
   
  public void dispose(){
	  new Menu();
	  super.dispose();
  }
     
}