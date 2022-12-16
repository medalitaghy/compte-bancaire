


package compte_bancaire;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	private static Scanner sc2;

	public static void main(String[] args) {
		
		ArrayList<Compte> listcpt = new ArrayList<Compte>();
		listcpt.add(new Compte("medali",200))  ;
		listcpt.add(new Compte("sid",100))  ;
		
	    sc2 = new Scanner(System.in);
	    int choix  =0 ;
	    do{
	    	System.out.println("================ =============== ");
	    	System.out.println("1 : Cree compte");
			System.out.println("2 : Crediter compte");
			System.out.println("3 : Debiter compte");
			System.out.println("4 : Virement un solde d'un compte");
			System.out.println("5 : Afficher compte");
			System.out.println("6 : Afficher solde compte");
			System.out.println("0 : pour exiter le programe ");
			
			System.out.println("================ =============== ");
			System.out.println("\n Entrez votre choix : \n");
			 choix = sc2.nextInt();
			if(choix==1){
				int i = Compte.nb_Compte - 10000 ; 
				System.out.println("1 : Cree compte \n entrez voter nom ");
				String nom = sc2.next() ;
				listcpt.add(new Compte(nom, 0)) ;
				System.out.println(listcpt.get(i).getNom()+" est cree par succsse votre slolde est "+listcpt.get(i).getSoled());

			}else if(choix==2){
				
				Compte.listerCompte(listcpt,"liste de Compte vous pouvez Crediter ") ;
				System.out.println("Entrez votre choix ");
				int ch = sc2.nextInt();
				System.out.println("entrez le montant  ");
				float Montant = sc2.nextFloat() ;
				listcpt.get(ch-1).Crediter(Montant) ;
				
			}else if(choix==3){
				
				Compte.listerCompte(listcpt,"liste de Compte que vous pouvez debiter  ") ;
				System.out.println("Entrez votre choix ");
				int ch = sc2.nextInt();
				System.out.println("entrez le montant  ");
				float Montant = sc2.nextFloat() ;
				listcpt.get(ch-1).Debiter(Montant) ;
				
			}else if(choix==4){
				
				Compte.listerCompte(listcpt,"liste de Compte que vous pouvez debiter  ") ;
				System.out.println("Saisissez le compte emetteur ");
				int ch1 = sc2.nextInt();
				System.out.println("Saisir le compte bénéficiaire ");
				int ch2 = sc2.nextInt();
				System.out.println("entrez le montant  ");
				float Montant = sc2.nextFloat() ;
				listcpt.get(ch1-1).virerSolde(listcpt.get(ch2-1), Montant);
			}else if(choix==5){
				
				Compte.listerCompte(listcpt,"liste de Compte vous pouvez afficher  ") ;
				System.out.println("Saisissez N du compte  ");
				int ch1 = sc2.nextInt();
				listcpt.get(ch1-1).afficher();
				
			}else if(choix==6){
				
				Compte.listerCompte(listcpt,"liste de Compte vous pouvez afficher leur solde   ") ;
				System.out.println("Saisissez N du compte  ");
				int ch1 = sc2.nextInt();
				System.out.println("le solde de "+listcpt.get(ch1-1).getNom()+" est : "+listcpt.get(ch1-1).getSoled());
			}
			
	    	
	    }while(choix != 0) ;
	    System.out.println(" \n fin \n");
	
			
	}
		
	
		}
