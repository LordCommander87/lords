package lords;

public class App {

	public static void main(String[] args) {
		Personagem olaf = new Personagem("Olaf",100,10,10,10);
		Batalha westeros = new Batalha(olaf);
		
		westeros.setMonstros();
		System.out.println(olaf.toString());
		System.out.println(westeros.getMonstros().toString());
		System.out.println(westeros.golpearMonstro(null, 0));
		System.out.println(westeros.getMonstros().toString());
		System.out.println(westeros.golpearMonstro(null, 0));
		System.out.println(westeros.getMonstros().toString());
		System.out.println(westeros.golpearPersonagem(null, 0));
		System.out.println(westeros.getMonstros().toString());
		System.out.println(olaf.toString());
	}

}
