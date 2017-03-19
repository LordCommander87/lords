package lords;

public class Item {
	private String nome;
	private int vida;
	private int for�a;
	private int resistencia;
	private int pre�o;
	private int energia;
	
	public Item(String nome,int vida,int for�a,int resistencia,int pre�o,int energia){
		this.nome = nome;
		this.vida = vida;
		this.for�a = for�a;
		this.resistencia = resistencia;
		this.pre�o = pre�o;
		this.energia = energia;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getFor�a() {
		return for�a;
	}
	
	public void setFor�a(int for�a) {
		this.for�a = for�a;
	}
	
	public int getResistencia() {
		return resistencia;
	}
	
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public int getPre�o() {
		return pre�o;
	}
	
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}
	
	public int getEnergia(){
		return energia;
	}
	
	public void setEnergia(int energia){
		this.energia = energia;
	}
	
	public String toString() {
		return "Item [nome=" + nome + ", vida=" + vida + ", for�a=" + for�a + ", resistencia=" + resistencia
				+ ", pre�o=" + pre�o + ", energia=" + energia + "]";
	}
	
	
}
