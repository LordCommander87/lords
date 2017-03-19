package lords;

public class Personagem {
	//atributos do personagem
	private String nome;
	private int vida;
	private int forca;
	private int resistencia;
	private int energia;
	
	//construtor
	public Personagem(String nome, int vida, int forca, int resistencia, int energia) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.resistencia = resistencia;
		this.energia = energia;
	}
	
	//funcoes padrao da classe
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", vida=" + vida + ", forca=" + forca + ", resistencia=" + resistencia
				+ ", energia=" + energia + "]";
	}
	
	//metodos para batalha
	public void reduzVida(int danoCausado){
		this.vida -= danoCausado;
	}
	
	public void reduzEnergia(int energiaPerdida){
		this.energia -= energiaPerdida;
		if(this.energia<0){
			this.energia = 0;
		}
	}
	
	//fim do Personagem
}
