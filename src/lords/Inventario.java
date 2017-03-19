package lords;
import java.util.ArrayList;

public class Inventario {
	private ArrayList<Item> equipamentos;
	private int gits;
	
	public Inventario(int gits){
		equipamentos = new ArrayList<Item>();
		this.gits = gits;
	}
	
	public int getGits(){
		return gits;
	}
	
	public void setGits(int gits){
		this.gits = gits;
	}
	
	public Item remove(){
		return equipamentos.remove(0);
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
