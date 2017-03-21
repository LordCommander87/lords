import guardians.Splash;
import javax.swing.*;

public class App {
	
	public App(){
		
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
	
	public static void main(String[] args){
		App app = new App();
		JFrame frame = new JFrame();
		
		ImageIcon icon = app.criarImageIcon("/imgs/Ma&Wa.png","Testando");
		
		JLabel lb = new JLabel(icon);
		lb.setBounds(0, 0, 200, 200);
		frame.add(lb);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
