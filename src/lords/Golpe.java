package lords;

public class Golpe {
	private String nome;
	private int dano; 
	private int stamina;
	
	public Golpe(String nome, int dano,int stamina) {
		this.nome = nome;
		this.dano = dano;
		this.stamina = stamina;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDano() {
		return dano;
	}
	
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public String toString(){
		return "Golpe: Nome = " + nome + " " + "Dano = " + 
				dano + " " + "Stamina = " + stamina + ".";
 	}
	
	public int calculaDano(Personagem p){
		return dano = (((p.getForça()/100) * dano + dano) - p.getResistencia());
	}
	
	public int calculaDano(Monstro m){
		return dano = (((m.getForça()/100) * dano + dano) - m.getResistencia());
	}
}
