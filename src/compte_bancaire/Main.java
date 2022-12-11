package compte_bancaire;

import java.util.Scanner;


public class Main {

	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		
		Compte[] listcp = new Compte[2] ; 
		
		
		for(int i =0; i<2;i++){
			System.out.println("le compte N "+(i+1));
			System.out.println("entrez le nom :");
			String nom = sc.next();
			System.out.println("entrez le soled :");
			float solde = sc.nextFloat() ;
			listcp[i] = new Compte(nom,solde) ; 	
		}
		
	
		for(int i =0; i<2;i++){
			listcp[i].afficher();	
		}
		
		
		
		
	}
	
}
