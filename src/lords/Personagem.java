package lords;
import java.util.ArrayList;

public class Personagem {
	//atributos do personagem
	private String nome;
	private int vida;
	private int forca;
	private int resistencia;
	private int energia;
	private ArrayList<Golpe> golpes;
	//equipamento
	private Item elmo;
	private Item armadura;
	private Item maoDireita;
	private Item maoEsquerda;
	private Inventario mochila;
	
	//construtor
	public Personagem(String nome, int vida, int forca, int resistencia, int energia) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.resistencia = resistencia;
		this.energia = energia;
		golpes = new ArrayList<Golpe>();
		golpes.add(new Golpe("Arranhão",1,1,"espada"));
		mochila = new Inventario(10);
		mochila.add(new Item("Pano velho",1,0,1,0,"","armadura",0));
		mochila.add(new Item("Espada velha",0,1,0,1,"espada","umaMao",0));
		mochila.add(new Item("Arco velho",0,1,0,1,"arco","duasMaos",0));
	}
	//metodos de equipo
	public void desequipar(String local){
		switch(local){
			case "elmo":
				if(this.elmo!=null){
					addItemMochila(new Item(this.elmo));
					this.vida -= this.elmo.getVida();
					this.forca -= this.elmo.getForca();
					this.resistencia -= this.elmo.getResistencia();
					this.energia -= this.elmo.getEnergia();
					this.elmo = null;
				}break;
			case "armadura":
				if(this.armadura!=null){
					addItemMochila(new Item(this.armadura));
					this.vida -= this.armadura.getVida();
					this.forca -= this.armadura.getForca();
					this.resistencia -= this.armadura.getResistencia();
					this.energia -= this.armadura.getEnergia();
					this.armadura = null;
				}break;
			case "maoEsquerda":
				if(this.maoEsquerda!=null){
					addItemMochila(new Item(this.maoEsquerda));
					this.vida -= this.maoEsquerda.getVida();
					this.forca -= this.maoEsquerda.getForca();
					this.resistencia -= this.maoEsquerda.getResistencia();
					this.energia -= this.maoEsquerda.getEnergia();
					this.maoEsquerda = null;
				}break;
			case "maoDireita":
				if(this.maoDireita!=null){
					addItemMochila(new Item(this.maoDireita));
					this.vida -= this.maoDireita.getVida();
					this.forca -= this.maoDireita.getForca();
					this.resistencia -= this.maoDireita.getResistencia();
					this.energia -= this.maoDireita.getEnergia();
					this.maoDireita = null;
				}break;
			case "duasMaos":
				desequipar("maoEsquerda");
				desequipar("maoDireita");
				mochila.remove(mochila.size()-1);
		}
	}
	
	public void equiparElmo(int iEquipamento){
		if(iEquipamento==-1){
			desequipar("elmo");
			this.elmo=null;
		}else{
			Item elmo = mochila.remove(iEquipamento);
			if(elmo.getTipo().equals("elmo")){
				desequipar("elmo");
				this.elmo = elmo;
				this.vida += this.elmo.getVida();
				this.forca += this.elmo.getForca();
				this.resistencia += this.elmo.getResistencia();
				this.energia += this.elmo.getEnergia();
			}
		}
	}
	public void equiparArmadura(int iEquipamento){
		if(iEquipamento==-1){
			desequipar("armadura");
			this.armadura=null;
		}else{
			Item armadura = mochila.remove(iEquipamento);
			if(armadura.getTipo().equals("armadura")){
				desequipar("armadura");
				this.armadura = armadura;
				this.vida += this.armadura.getVida();
				this.forca += this.armadura.getForca();
				this.resistencia += this.armadura.getResistencia();
				this.energia += this.armadura.getEnergia();
			}
		}
	}
	public void equiparMaoDireita(int iEquipamento){
		if(iEquipamento==-1){
			if(this.maoDireita.getMao().equals("umaMao")){desequipar("maoDireita");}
			else{desequipar("duasMaos");}
		}else{
			Item maoDireita = mochila.remove(iEquipamento);
			if(maoDireita.getMao().equals("umaMao")){
				if(this.maoDireita!=null && this.maoDireita.getMao().equals("duasMaos")){
					this.vida += this.maoDireita.getVida();
					this.forca += this.maoDireita.getForca();
					this.resistencia += this.maoDireita.getResistencia();
					this.energia += this.maoDireita.getEnergia();
					desequipar("maoEsquerda");
					mochila.remove(mochila.size()-1);
				}
				desequipar("maoDireita");
				this.maoDireita = maoDireita;
				this.vida += this.maoDireita.getVida();
				this.forca += this.maoDireita.getForca();
				this.resistencia += this.maoDireita.getResistencia();
				this.energia += this.maoDireita.getEnergia();
			}
			if(maoDireita.getMao().equals("duasMaos")){
				if(this.maoDireita==this.maoEsquerda){
					if(this.maoDireita==null);
					else{
						this.vida += this.maoDireita.getVida();
						this.forca += this.maoDireita.getForca();
						this.resistencia += this.maoDireita.getResistencia();
						this.energia += this.maoDireita.getEnergia();
						desequipar("duasMaos");
					}
				}
				desequipar("duasMaos");
				this.maoDireita = maoDireita;
				this.maoEsquerda = maoDireita;
				this.vida += this.maoDireita.getVida();
				this.forca += this.maoDireita.getForca();
				this.resistencia += this.maoDireita.getResistencia();
				this.energia += this.maoDireita.getEnergia();
			}
		}
	}
	public void equiparMaoEsquerda(int iEquipamento){
		if(iEquipamento==-1){
			if(this.maoEsquerda.getMao().equals("umaMao")){desequipar("maoEsquerda");}
			else{desequipar("duasMaos");}
		}else{
			Item maoEsquerda = mochila.remove(iEquipamento);
			if(maoEsquerda.getMao().equals("umaMao")){
				if(this.maoEsquerda!=null && this.maoDireita.getMao().equals("duasMaos")){
					this.vida += this.maoEsquerda.getVida();
					this.forca += this.maoEsquerda.getForca();
					this.resistencia += this.maoEsquerda.getResistencia();
					this.energia += this.maoEsquerda.getEnergia();
					desequipar("maoDireita");
					mochila.remove(mochila.size()-1);
				}
				desequipar("maoEsquerda");
				this.maoEsquerda = maoEsquerda;
				this.vida += this.maoEsquerda.getVida();
				this.forca += this.maoEsquerda.getForca();
				this.resistencia += this.maoEsquerda.getResistencia();
				this.energia += this.maoEsquerda.getEnergia();
			}
			if(maoEsquerda.getMao().equals("duasMaos")){
				if(this.maoEsquerda==this.maoDireita){
					if(this.maoEsquerda==null);
					else{
						this.vida += this.maoEsquerda.getVida();
						this.forca += this.maoEsquerda.getForca();
						this.resistencia += this.maoEsquerda.getResistencia();
						this.energia += this.maoEsquerda.getEnergia();
						desequipar("duasMaos");
					}
				}
				this.maoEsquerda = maoEsquerda;
				this.maoDireita = maoEsquerda;
				this.vida += this.maoEsquerda.getVida();
				this.forca += this.maoEsquerda.getForca();
				this.resistencia += this.maoEsquerda.getResistencia();
				this.energia += this.maoEsquerda.getEnergia();
			}
		}
	}
	
	public ArrayList<Golpe> getGolpes() {
		return golpes;
	}
	public Item getElmo() {
		return elmo;
	}
	public Item getArmadura() {
		return armadura;
	}
	public Item getMaoDireita() {
		return maoDireita;
	}
	public Item getMaoEsquerda() {
		return maoEsquerda;
	}
	public Inventario getMochila() {
		return mochila;
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
				+ ", energia=" + energia + ", golpes=" + golpes + ", elmo=" + elmo + ", armadura=" + armadura
				+ ", maoDireita=" + maoDireita + ", maoEsquerda=" + maoEsquerda + ", mochila=" + mochila + "]";
	}
	
	//metodos para batalha
	public ArrayList<Golpe> golpesAtuais(){
		int i;
		ArrayList<Golpe> golpesAtuais = new ArrayList<Golpe>();
		
		if(this.maoDireita!=null && this.maoDireita.getMao().equals("duasMaos")){
			for(i=0;i<this.golpes.size();i++){
				if(golpes.get(i).getTipo().equals(this.maoDireita.getTipo())){
					golpesAtuais.add(golpes.get(i));
				}
			}
		}
		else{
			if(maoEsquerda==null){
				if(maoDireita==null);
				else{
					for(i=0;i<this.golpes.size();i++){
						if(golpes.get(i).getTipo().equals(this.maoDireita.getTipo())){
							golpesAtuais.add(golpes.get(i));
						}
					}
				}
			}
			else{
				if(maoDireita==null){
					for(i=0;i<this.golpes.size();i++){
						if(golpes.get(i).getTipo().equals(this.maoEsquerda.getTipo())){
							golpesAtuais.add(golpes.get(i));
						}
					}
				}else{
					for(i=0;i<this.golpes.size();i++){
						if(golpes.get(i).getTipo().equals(this.maoDireita.getTipo())){
							golpesAtuais.add(golpes.get(i));
						}
					}for(i=0;i<this.golpes.size();i++){
						if(golpes.get(i).getTipo().equals(this.maoEsquerda.getTipo()) && !golpes.get(i).getTipo().equals(this.maoDireita.getTipo())){
							golpesAtuais.add(golpes.get(i));
						}
					}
				}
			}
			
		}
		
		return golpesAtuais;
	}
	
	public void reduzVida(int danoCausado){
		this.vida -= danoCausado;
	}
	
	public void reduzEnergia(int energiaPerdida){
		this.energia -= energiaPerdida;
		if(this.energia<0){
			this.energia = 0;
		}
	}
	
	public void addGolpe(Golpe golpe){
		this.golpes.add(golpe);
	}
	
	public void addItemMochila(Item item){
		this.mochila.add(item);
	}
	
	public void removeItemMochila(int indice){
		this.mochila.remove(indice);
	}
	
	public void addGits(int gits){
		int lucro = this.mochila.getGits();
		lucro += gits;
		this.mochila.setGits(lucro);
	}
	
	public void removeGits(int gits){
		int preju = this.mochila.getGits();
		preju -= gits;
		this.mochila.setGits(preju);
	}
	//fim do Personagem
}
