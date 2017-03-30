package guardians;

import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;

public class Jogo extends JFrame implements KeyListener
{
    private JLabel lbBackGround;
    private JLabel lbPerson;
    private JLabel lbInventario;
    private ImageIcon imFundo;
    private ImageIcon imInventario;
    private ImageIcon persFrente2 = criarImageIcon("../imgs/protagonista/costa2.png","costa2");
	private ImageIcon persFrente1 = criarImageIcon("../imgs/protagonista/costa1.png","costa1");
	private ImageIcon persFrente3 = criarImageIcon("../imgs/protagonista/costa3.png","costa3");
	
	private ImageIcon persBaixo2 = criarImageIcon("../imgs/protagonista/frente2.png","frente2");
	private ImageIcon persBaixo1 = criarImageIcon("../imgs/protagonista/frente1.png","frente1");
	private ImageIcon persBaixo3 = criarImageIcon("../imgs/protagonista/frente3.png","frente3");
	
	private ImageIcon persDireita2 = criarImageIcon("../imgs/protagonista/direita2.png","direita2");
	private ImageIcon persDireita1 = criarImageIcon("../imgs/protagonista/direita1.png","direita1");
	private ImageIcon persDireita3 = criarImageIcon("../imgs/protagonista/direita3.png","direita3");
	
	private ImageIcon persEsquerda2 = criarImageIcon("../imgs/protagonista/esquerda2.png","esquerda2");
	private ImageIcon persEsquerda1 = criarImageIcon("../imgs/protagonista/esquerda1.png","esquerda1");
	private ImageIcon persEsquerda3 = criarImageIcon("../imgs/protagonista/esquerda3.png","esquerda3");

	private int flagFrente=0,flagEsquerda=0,flagDireita=0,flagBaixo=0,flagInventario=0;
    
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
       
       lbPerson = new JLabel(persFrente2);
       lbPerson.setBounds(0,0,640,480);
       add(lbPerson);
       
       imInventario = criarImageIcon("../imgs/telaInventario.png","Inventario");
       lbInventario = new JLabel(imInventario);
       lbInventario.setBounds(225,-10,640,480);
       
       imFundo = criarImageIcon("../imgs/mapateste.png","BackGround");
       lbBackGround = new JLabel(imFundo);
       lbBackGround.setBounds(0,0,640,480);
       add(lbBackGround);
       
       this.addKeyListener(this);
    }
    
    public void keyPressed(KeyEvent e){
    	switch(e.getKeyCode()){
		case KeyEvent.VK_W:
			lbPerson.setLocation((lbPerson.getX())+0,(lbPerson.getY())-5);
			switch(flagFrente){
			case 0:
				lbPerson.setIcon(persFrente3);
				flagFrente++;
				flagEsquerda=0;
				flagDireita=0;
				flagBaixo=0;
				break;
			case 5:
				lbPerson.setIcon(persFrente2);
				flagFrente++;
				flagEsquerda=0;
				flagDireita=0;
				flagBaixo=0;
				break;
			case 10:
				lbPerson.setIcon(persFrente1);
				flagFrente++;
				flagEsquerda=0;
				flagDireita=0;
				flagBaixo=0;
				break;
			case 15:
				lbPerson.setIcon(persFrente2);
				flagFrente=0;
				flagEsquerda=0;
				flagDireita=0;
				flagBaixo=0;
				break;
			default:
				flagFrente++;
				flagEsquerda=0;
				flagDireita=0;
				flagBaixo=0;
				break;
			}
			break;
			
		case KeyEvent.VK_D:
			lbPerson.setLocation((lbPerson.getX())+5,(lbPerson.getY())+0);
			switch(flagDireita){
			case 0:
				lbPerson.setIcon(persDireita3);
				flagDireita++;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			case 5:
				lbPerson.setIcon(persDireita2);
				flagDireita++;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			case 10:
				lbPerson.setIcon(persDireita1);
				flagDireita++;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			case 15:
				lbPerson.setIcon(persDireita2);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			default:
				flagDireita++;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			}
			break;
			
		case KeyEvent.VK_A:
			lbPerson.setLocation((lbPerson.getX())-5,(lbPerson.getY())+0);
			switch(flagEsquerda){
			case 0:
				lbPerson.setIcon(persEsquerda3);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda++;
				flagBaixo=0;
				break;
			case 5:
				lbPerson.setIcon(persEsquerda2);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda++;
				flagBaixo=0;
				break;
			case 10:
				lbPerson.setIcon(persEsquerda1);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda++;
				flagBaixo=0;
				break;
			case 15:
				lbPerson.setIcon(persEsquerda2);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			default:
				flagDireita=0;
				flagFrente=0;
				flagEsquerda++;
				flagBaixo=0;
				break;
			}
			break;
			
		case KeyEvent.VK_S:
			lbPerson.setLocation((lbPerson.getX())+0,(lbPerson.getY())+5);
			switch(flagBaixo){
			case 0:
				lbPerson.setIcon(persBaixo3);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo++;
				break;
			case 5:
				lbPerson.setIcon(persBaixo2);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo++;
				break;
			case 10:
				lbPerson.setIcon(persBaixo1);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo++;
				break;
			case 15:
				lbPerson.setIcon(persBaixo2);
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo=0;
				break;
			default:
				flagDireita=0;
				flagFrente=0;
				flagEsquerda=0;
				flagBaixo++;
				break;
			}
			break;
		case KeyEvent.VK_I:
			switch(flagInventario){
			case 0:
				remove(lbBackGround);
				add(lbInventario);
				add(lbBackGround);
				flagInventario++;
				break;
			case 1:
				remove(lbInventario);
				flagInventario++;
				break;
			}
			break;
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
