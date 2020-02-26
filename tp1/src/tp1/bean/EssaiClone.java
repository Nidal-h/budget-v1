package tp1.bean;

class EssaiClone {
	public static void main(String arg[]) throws CloneNotSupportedException {
		ObjetClonable I = new ObjetClonable(), J;
		J = I.clone();
		System.out.println("Dans l'original " + I.getEntierLocal() + " " + I.getEntierA().getEntier() + " "
				+ I.getTableau()[1] + " " + I.getEntierB().getEntier());
		System.out.println("Dans la copie " + J.getEntierLocal() + " " + J.getEntierA().getEntier() + " "
				+ J.getTableau()[1] + " " + J.getEntierB().getEntier());
		I.setEntierLocal(2);
		I.getEntierA().setEntier(20);
		I.getTableau()[1] = 200;
		I.getEntierB().setEntier(3000);
		System.out.println("Apres changement de tout ce que contient l'original :");
		System.out.println("Dans l'original " + I.getEntierLocal() + " " + I.getEntierA().getEntier() + " "
				+ I.getTableau()[1] + " " + I.getEntierB().getEntier());
		System.out.println("Dans la copie " + J.getEntierLocal() + " " + J.getEntierA().getEntier() + " "
				+ J.getTableau()[1] + " " + J.getEntierB().getEntier());
	}
}
