package lords;
import java.util.ArrayList;

public class Inventario {
	private ArrayList<Item> equipamentos;
	private int gits;
	
	public Inventario(int gits){
		equipamentos = new ArrayList<Item>();
		this.gits = gits;
	}
	
	public ArrayList<Item> getEquipamentos(){
		return equipamentos;
	}
	
	public int getGits(){
		return gits;
	}
	
	public void setGits(int gits){
		this.gits = gits;
	}
	
	public Item remove(int indice){
		return equipamentos.remove(indice);
	}
	
	public void add(Item novoItem){
		equipamentos.add(novoItem);
	}
	
	public int size(){
		return equipamentos.size();
	}
	
	public String toString(){
		return "No inventário existem: " + equipamentos.size() + " Itens, e: " + getGits() + " gits.";
	}
	

}
