package lords;

public class Item {
	private String nome;
	private int vida;
	private int forca;
	private int resistencia;
	private int preco;
	private int energia;
	private String tipo;
	private String mao;
	
	public Item(String nome,int vida,int forca,int resistencia,int energia,String tipo,String mao,int preco){
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.resistencia = resistencia;
		this.preco = preco;
		this.energia = energia;
		this.tipo = tipo;
		this.mao = mao;
	}
	
	public Item(Item item){
		this.nome = item.getNome();
		this.vida = item.getVida();
		this.forca = item.getForca();
		this.resistencia = item.getResistencia();
		this.preco = item.getPreco();
		this.energia = item.getPreco();
		this.tipo = item.getTipo();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getMao() {
		return mao;
	}

	public void setMao(String mao) {
		this.mao = mao;
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
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public int getEnergia(){
		return energia;
	}
	
	public void setEnergia(int energia){
		this.energia = energia;
	}
	
	public String toString() {
		return "Item [nome=" + nome + ", vida=" + vida + ", força=" + forca + ", resistencia=" + resistencia
				+ ", preço=" + preco + ", energia=" + energia + ", tipo=" + tipo + "]";
	}
	
	
}
