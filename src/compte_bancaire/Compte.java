package compte_bancaire;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compte  {
	static int nb_Compte = 10000 ; 
	private  int numero ;
	private  String nom ; 
	private float solde ; 
	private float decouvert ; 
	private float decouvertmax ; 
	private float debitmax ; 
	

	Compte(String nom,float solde ){
		this.nom  = nom ; 
		nb_Compte++; 
		this.numero = nb_Compte ; 
		this.setDecouvertmax(800) ; 
		this.debitmax = 1000 ;
		this.solde = solde ; 
	}

	public int getNumero() {
		return numero;
	}
	
	public String getNom() {
		return nom;
	}


	
	public float getSoled(){
		
		return solde ; 
	}


	public float getDecouvert() {
		if(solde >= 0 ){
			decouvert = 0  ; 
		}else{
		decouvert  =  solde * -1 ; }
		
		return decouvert ; 
		
	}

	public void setDecouvert(float decouvert) {
		
		this.decouvert = decouvert;
	}
	
	public float getDecouvertmax() {
		return decouvertmax;
	}

	public void setDecouvertmax(float decouvertmax) {
		this.decouvertmax = decouvertmax;
	}
	
	public float getDebitmax() {
		return debitmax;
	}

	public void setDebitmax(float debitmax) {
		this.debitmax = debitmax;
	}
	
	public void Crediter(float Montant){
		if(getSoled()+Montant > debitmax){
			System.out.println("vous pouvez pas Crediter le solde ");

		}else{
			this.solde += Montant ; 
			System.out.println(" le solde "+getNom()+" est Crediter par  "+Montant+"MRU ");
		}
	}
	
	public void Debiter(float Montant){
		
		
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		this.solde -= Montant ; 
		System.out.println(" le solde de "+getNom()+" est debiter par  "+Montant+"MRU  ");
		}
	
	}
	
	
	
	public void virerSolde(Compte c,float Montant){
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		if(getSoled() > Montant){
			this.solde -= Montant ; 
			c.Crediter(Montant);
			System.out.println(" Un virment de "+Montant+"MRU  ");
	
		}else{
				System.out.println("votre solde  est n'est pas suffisant ");
			}
		}
		
	}
	
	public void afficher(){
		System.out.println("====="+(getNumero()-10000) +"=========  compte N : "+getNumero()+ "==================   ") ;
		System.out.println("nom du propreiter :"+getNom()) ;
		System.out.println("votre solde est :"+getSoled()) ;
		System.out.println("decouvert max est :"+getDecouvertmax()) ;
		System.out.println("debit max est :"+getDebitmax()) ;
		System.out.println("==============  compte N : "+getNumero()+ "==================   ") ;
	}
	
	protected static int listerCompte(ArrayList<Compte> listcpt,String message){
		if(listcpt.size() >0){
			System.out.println(message);
			for(Compte c : listcpt){
				System.out.println(c.getNumero()-10000 +" : nom est "+c.getNom()) ;
			}
			return listcpt.size() ; 
		}
		return 0  ;
	}
	
	protected static int choixCompte(String  s,int r){
		int choix ;
		String chek = "^[0-"+r+"]$"; 
		Pattern p = Pattern.compile(chek); 
		Matcher m = p.matcher(s) ; 
		if(m.find()){
			choix = Integer.parseInt(s); 
		}else{
			choix = -1 ; 
		}
		return choix ; 
	}

	

}

