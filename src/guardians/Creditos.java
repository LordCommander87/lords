package guardians;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Creditos extends JFrame
{
    private JLabel lbDev;
    private ImageIcon imCreditos;
    
    public Creditos()
    {
    	setLayout(null);
    	
        imCreditos = criarImageIcon("../imgs/creditos.png","Creditos");
        lbDev = new JLabel(imCreditos);
        lbDev.setBounds(0,0,480,320);
        add(lbDev);
    	
        
        setVisible(true);
       	setSize(480,320);
       	setLocationRelativeTo(null);
       	setResizable(false);
       	setTitle("Creditos ©");
       	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       	ImageIcon icone = criarImageIcon("../imgs/IconL.png","Icone do jogo");
       	setIconImage(icone.getImage());
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

