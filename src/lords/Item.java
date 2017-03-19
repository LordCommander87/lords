package lords;

public class Item {
	private String nome;
	private int vida;
	private int força;
	private int resistencia;
	private int preço;
	private int energia;
	
	public Item(String nome,int vida,int força,int resistencia,int preço,int energia){
		this.nome = nome;
		this.vida = vida;
		this.força = força;
		this.resistencia = resistencia;
		this.preço = preço;
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
	
	public int getForça() {
		return força;
	}
	
	public void setForça(int força) {
		this.força = força;
	}
	
	public int getResistencia() {
		return resistencia;
	}
	
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public int getPreço() {
		return preço;
	}
	
	public void setPreço(int preço) {
		this.preço = preço;
	}
	
	public int getEnergia(){
		return energia;
	}
	
	public void setEnergia(int energia){
		this.energia = energia;
	}
	
	public String toString() {
		return "Item [nome=" + nome + ", vida=" + vida + ", força=" + força + ", resistencia=" + resistencia
				+ ", preço=" + preço + ", energia=" + energia + "]";
	}
	
	
}
