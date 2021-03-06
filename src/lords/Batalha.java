package lords;
import java.util.ArrayList;
import java.util.Random;

public class Batalha {
	//participantes da batalha
	private Personagem protagonista;
	private ArrayList<Monstro> monstros;
	
	//monstros da regiao
	private ArrayList<Monstro> daRegiao;
	
	//construtor
	public Batalha(Personagem protagonista) {
		super();
		this.protagonista = protagonista;
		this.monstros = new ArrayList<Monstro>();
		daRegiao = new ArrayList<Monstro>();
		daRegiao.add(new Monstro("Goble",8,1,1,10));
		daRegiao.add(new Monstro("Morfis",15,1,1,10));
		daRegiao.add(new Monstro("Pedregulho",10,1,3,10));
		daRegiao.add(new Monstro("Fatri",10,1,1,10));
		daRegiao.add(new Monstro("Captain Fatri",15,3,1,10));
	}
	
	//metodos padrao da classe
	public Personagem getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(Personagem protagonista) {
		this.protagonista = protagonista;
	}
	public ArrayList<Monstro> getMonstros() {
		return monstros;
	}
	public void setMonstros() {
		int i, numMonstros, iMonstro;
		Random gerador = new Random();
		numMonstros = gerador.nextInt(3); //sorteiando numero de monstro - 1 a 3 monstros
		
		for(i=0;i<=numMonstros;i++){
			iMonstro = gerador.nextInt(daRegiao.size()-1);
			//Monstro aux = daRegiao.get(iMonstro);
			Monstro aux = new Monstro(daRegiao.get(iMonstro));
			this.monstros.add(aux);
		}
	}

	public ArrayList<Monstro> getDaRegiao() {
		return daRegiao;
	}
	@Override
	public String toString() {
		return "Batalha [protagonista=" + protagonista + ", monstros=" + monstros + ", daRegiao=" + daRegiao + "]";
	}

	//metodos para batalha
	public String golpearMonstro(Golpe golpe, int iMonstro){
		if(protagonista.getEnergia()<golpe.getEnergia()){
			return "Energia insuficiente";
		}else{
			monstros.get(iMonstro).reduzVida(golpe.calculaDano(protagonista));
			protagonista.reduzEnergia(golpe.getEnergia());
			if(monstros.get(iMonstro).getVida()<1){
				monstros.remove(iMonstro);
				if(monstros.size()==0){
					return fimDaBatalha(0);
				}
				return "Monstro derrotado";
			}
			return "Golpeado";
		}
	}
	
	public String golpearPersonagem(Golpe golpe, int iMonstro){
		if(monstros.get(iMonstro).getEnergia()<golpe.getEnergia()){
			return "Falhou";
		}else{
			protagonista.reduzVida(golpe.calculaDano(monstros.get(iMonstro)));
			monstros.get(iMonstro).reduzEnergia(golpe.getEnergia());
			if(protagonista.getVida()<1){
				return fimDaBatalha(1);
			}
			return "Golpeado";
		}
	}
	
	public String fimDaBatalha(int vencendor){
		if(vencendor==0)return "Voc� ganhou";
		return "Voc� foi derrotado";
	}
	
	//fim da Batalha
}
