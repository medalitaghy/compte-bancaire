package compte_bancaire;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compte c1  = new Compte("medali",1000) ; 
		Compte c2  = new Compte("sidi",5000) ;
		c2.afficher();
		
		
		
//		System.out.println("decouvert :"+c1.getDecouvert());
//		System.out.println("decouvert max :"+c1.getDecouvertmax());
		System.out.println("nombre de  compte dans  le banque :"+Compte.nb_Compte);		
	}

}
