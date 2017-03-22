package guardians;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Jogo extends JFrame implements KeyListener
{
    private JLabel lbBackGround;
    private JLabel lbPerson;
    private ImageIcon imFundo;
    private ImageIcon imSprite;
    
    public Jogo()
    {
       setVisible(true);
       setSize(640,480);
       setLocationRelativeTo(null);
       setResizable(false);
       setTitle("Lords & The Guardian's Tale");
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       ImageIcon icone = criarImageIcon("../imgs/IconL.png","Icone");
       setIconImage(icone.getImage());
        
       setLayout(null);
       
       imSprite = criarImageIcon("../imgs/personagem.png","Sprite Principal");
       lbPerson = new JLabel(imSprite);
       lbPerson.setBounds(0,0,640,480);
       add(lbPerson);
       
       imFundo = criarImageIcon("../imgs/mapateste.png","BackGround");
       lbBackGround = new JLabel(imFundo);
       lbBackGround.setBounds(0,0,640,480);
       add(lbBackGround);
       
       this.addKeyListener(this);
    }
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_W){
            lbPerson.setLocation(0,-2);
        }
        
        if(e.getKeyCode() == KeyEvent.VK_D){
            lbPerson.setLocation(2,0);
        }
        
        if(e.getKeyCode() == KeyEvent.VK_A){
            lbPerson.setLocation(-2,0);
        }
        
        if(e.getKeyCode() == KeyEvent.VK_S){
            lbPerson.setLocation(0,2);
        }
    }
  
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    
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
