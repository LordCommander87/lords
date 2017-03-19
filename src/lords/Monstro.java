package lords;

public class Monstro {
	//atributos do monstro
	private String nome;
	private int vida;
	private int forca;
	private int resistencia;
	private int energia;
	
	//construtor
	public Monstro(String nome, int vida, int forca, int resistencia, int energia) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.resistencia = resistencia;
		this.energia = energia;
	}
	
	public Monstro(Monstro monstro) {
		super();
		this.nome = monstro.getNome();
		this.vida = monstro.getVida();
		this.forca = monstro.getForca();
		this.resistencia = monstro.getResistencia();
		this.energia = monstro.getEnergia();
	}
	
	//metodos padrao da classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}	
	public int getVida() {
		return vida;
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
		return "Monstro [nome=" + nome + ", vida=" + vida + ", forca=" + forca + ", resistencia=" + resistencia
				+ ", energia=" + energia + "]";
	}

	//metodos para batalha
	public void reduzVida(int danoCausado){
		this.vida -= danoCausado;
	}
	public void reduzEnergia(int energiaPerdida){
		this.energia -= energiaPerdida;
	}
}
