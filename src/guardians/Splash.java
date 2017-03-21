package guardians;
import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
 
public class Splash extends JFrame{
	
	private static JLabel lbSplash;
	private ImageIcon imSplash;
  
	public Splash() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700,300);
		setLocationRelativeTo(null);
		//setVisible(true);
		ImageIcon icone = criarImageIcon("../imgs/IconL.png","Icone do Jogo");
		setIconImage(icone.getImage());
	     
		setLayout(null);
     
	    imSplash = criarImageIcon("../imgs/splashMarca.png","Tela Splash");
	    
	    lbSplash = new JLabel(imSplash);
	    lbSplash.setBounds(0,0,700,300);
     
	    add(lbSplash);
	    
	    setVisible(true);
	    
	    try {
			Thread.sleep (3000);
	    }
		catch (InterruptedException ex) {}
	    	dispose();
	}
   
	public void dispose(){
	  new Menu();
	  super.dispose();
	}
     
	public ImageIcon criarImageIcon(String caminho, String descricao) {
		java.net.URL imgURL = getClass().getResource(caminho);
		if (imgURL != null) {
			return new ImageIcon(imgURL, descricao);
		} else {
			System.err.println("Não foi possível carregar o arquivo de imagem: " + caminho);
			return null;
		}
	}
}