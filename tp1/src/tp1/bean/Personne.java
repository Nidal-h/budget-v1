package tp1.bean;

class Personne implements Cloneable {
	private String nom;
	private String prenom;
	private int age;

	public Personne(String unNom, String unPrenom, int unAge) {
		nom = unNom;
		prenom = unPrenom;
		age = unAge;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

public static void main(String[] args){
	Personne myStudent = new Personne("MyStudent","SIR", 21);  
 Personne myStudentClone = null,myStudentClone2=myStudent; 
 try{ 
 	myStudentClone = (Personne) myStudent.clone();	
 	}catch(Exception e) { 
 		System.out.println("Erreur");
 	}
 System.out.println(myStudent.nom + " " + myStudent.prenom+" "+ myStudent.age); 
 System.out.println(myStudentClone.nom + " " + myStudentClone.prenom+" " + myStudentClone.age); 
 System.out.println(myStudentClone2.nom + " " + myStudentClone2.prenom+" " + myStudentClone2.age);
}
}