package lords;

public class Golpe {
	private String nome;
	private int dano; 
	private int energia;
	private String tipo;
	
	public Golpe(String nome, int dano,int energia, String tipo) {
		this.nome = nome;
		this.dano = dano;
		this.energia = energia;
		this.tipo = tipo;
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
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String toString(){
		return "[Golpe: Nome = " + nome + ", " + "Dano = " + 
				dano + ", " + "Energia = " + energia + ", " +"Tipo = " + tipo + "]";
 	}
	
	public int calculaDano(Personagem p){
		return dano = (((p.getForca()/100) * dano + dano) - p.getResistencia());
	}
	
	public int calculaDano(Monstro m){
		return dano = (((m.getForca()/100) * dano + dano) - m.getResistencia());
	}
}
