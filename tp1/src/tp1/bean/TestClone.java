package tp1.bean;

class TestClone{
	public static void main(String args[]){ 
		Cellule x = new Cellule();
		x.afficher();
		System.out.println(x);
		Cellule y = (Cellule) x.clone(); 
		y.afficher();
		System.out.println(y);
		x.changeMe();
		x.afficher();
		y.afficher();
		Cellule x1= new Cellule();
		Cellule y1 = new Cellule(x1);
		x1.afficher();
		y1.afficher();
		}
	

	}

