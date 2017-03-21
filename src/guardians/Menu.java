package guardians;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu  extends JFrame implements ActionListener
{
private JButton btStart, btCredits, btExit;
private JLabel lbFundo;
private ImageIcon imFundo;
 
public Menu() {
	
	try{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e){
        e.printStackTrace();
    }
  
	setLayout(null);
  
	imFundo = new ImageIcon("castlemenu.png");
	lbFundo = new JLabel(imFundo);
	lbFundo.setBounds(0,0,640,480);
           
	btStart = new JButton("Iniciar");
	btStart.addActionListener(this);
	btStart.setBounds(450,50,100,20);
	add(btStart);
  
	btCredits = new JButton("Creditos");
	btCredits.addActionListener(this);
	btCredits.setBounds(450,100,100,20);
	add(btCredits);
  
	btExit = new JButton("Sair");
	btExit.addActionListener(this);
	btExit.setBounds(450,150,100,20);
	add(btExit);
  
	add(lbFundo);
           
	setSize(640,480);
	setLocationRelativeTo(null);
	getContentPane().setBackground(Color.WHITE);
	setTitle("Menu");
	setResizable(false);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setVisible(true);
	ImageIcon icone = new ImageIcon("IconL.png");
	setIconImage(icone.getImage());
}

public void actionPerformed(ActionEvent acesso)
{
	
	if (acesso.getSource() == btStart) {
		System.out.println("Botão iniciar pressionado!");
  }
   
	if (acesso.getSource() == btCredits) {
		System.out.println("Matheus Damasceno & Mario Matheus!");
  }
  
	if (acesso.getSource() == btExit) {
		super.dispose();
  }
         
}
 
}
