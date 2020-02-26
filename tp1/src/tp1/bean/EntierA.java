package tp1.bean;

public class EntierA implements Cloneable { 
	private int entier = 10;
	public int getEntier() { 
		return entier; 
		}
	public void setEntier(int entier) { 
		this.entier = entier; 
	        }
	@Override 
	public EntierA clone() throws CloneNotSupportedException {
		return (EntierA)super.clone(); 
	}
}
