package compte_bancaire;



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
			System.out.println(" le solde "+getNom()+" est Crediter par  "+Montant+"MRU  votre solde est :"+solde);
		}
	}
	
	public void Debiter(float Montant){
		
		
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		this.solde -= Montant ; 
		System.out.println(" le solde "+getNom()+" est debiter par  "+Montant+"MRU  votre solde est :"+solde);
		}
	
	}
	
	
	
	public void virerSolde(Compte c,float Montant){
		if(getDecouvert()+Montant > getDecouvertmax()){
			System.out.println("vous pouvez pas debiter le solde ");
		}else{
			
		if(getSoled() > Montant){
			this.solde -= Montant ; 
			c.Crediter(Montant);
			System.out.println(" Un verment de "+Montant+"MRU  votre solde est :"+solde);
			}else{
				System.out.println("votre solde  est n'est pas suffisant ");
			}
		
		}
		
		
	}
	public void print(String s){
		System.out.println(s) ;
	}
	
	public void afficher(){
		System.out.println("==============  compte ==================   ") ;
		System.out.println("numero du compte est :"+getNumero()) ;
		System.out.println("nom du propreiter :"+getNom()) ;
		System.out.println("votre solde est :"+getSoled()) ;
		System.out.println("decouvert max est :"+getDecouvertmax()) ;
		System.out.println("debit max est :"+getDebitmax()) ;
		System.out.println("==============  compte ==================   ") ;
		
	}

	

}

