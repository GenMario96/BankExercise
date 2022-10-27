package it.gennaro.conto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	Scanner s = new Scanner(System.in);
	int scelta;
	int grandezza;
	Correntista corr = new Correntista();
	ArrayList<Correntista> correntisti = new ArrayList<Correntista>();

	
	public void menuScelta()
	{
		
		while(scelta!=8)
		{
			System.out.println("Benvenuti nel menu del database");
			System.out.println("Premi 1 per caricare l'utente");
			System.out.println("Premi 2 per stampare");
			System.out.println("Premi 3 per cercare e modificare");
			System.out.println("Premi 4 per fare l'ordinamento tramite cognome");
			System.out.println("Premi 5 per creare un nuovo conto");
			System.out.println("Premi 6 per fare un versamento");
			System.out.println("Premi 7 per fare un prelievo");
			System.out.println("Premi 8 per uscire");
			this.scelta = Integer.parseInt(s.nextLine());
			
			switch (this.scelta)
			{
			
			case 1:
			grandezza++;
			correntisti.add(corr.inserimentoCorrentista(correntisti));
			
			break;
			
			case 2 :
				
					
					for(int i=0;i<grandezza;i++)
					{
					
						System.out.println(correntisti.get(i));
					//	System.out.println(correntisti.get(i).getContidue());

					}
				
				
				
			break;
			
			case 3 :
				
				corr.ricercaModifica(correntisti);
				break;
				
			case 4:
				
				corr.ordinamento(correntisti);
				break;
				
			case 5:
				
				
				
				corr.nuovoConto(correntisti);
				
				break;
				
			case 6:
				corr.versamento(correntisti);
				break;
			case 7:
				corr.prelievo(correntisti);
				break;
			}
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
