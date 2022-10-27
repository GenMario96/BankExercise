package it.gennaro.conto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Correntista extends Utente {
	
	
	Conto conto = new Conto();
	ArrayList<Conto> contidue = new ArrayList<Conto>();
	//ArrayList<Correntista> correntisti = new ArrayList<Correntista>();

	
	public ArrayList<Conto> getContidue() {
		return contidue;
	}
	public void setContidue(ArrayList<Conto> contidue) {
		this.contidue = contidue;
	}


	private String nome;
	int grandezza;
	
	Scanner s = new Scanner(System.in);



	Correntista() {
		
		
		
	}
	@Override
	public String toString() {
		return "Correntista [conti=" + contidue + ", , nome=" + nome
				+ ", cognome=" + cognome + ", cf=" + cf + "]";
	}


	private String cognome;
	private String cf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}

	


	public Correntista( String nome, String cognome, String cf) {

		

		this.nome = nome;

		this.cognome = cognome;
		this.cf = cf;
	}
	
	
	public Correntista inserimentoCorrentista(ArrayList<Correntista> correntisti)
	{
		grandezza++;
		
		Correntista corr = new Correntista();
		Conto conto = new Conto();

		
		ArrayList<Conto> contiduel = new ArrayList<Conto>();


			System.out.println("Inserisci nome");
			corr.setNome(s.nextLine());
			System.out.println("Inserisci cognome");
			corr.setCognome(s.nextLine());
			System.out.println("Inserisci il cf");
			corr.setCf(s.nextLine());
			
			System.out.println("Inserisci numero conto");
			
			conto.setNumeroConto(s.nextLine());
			
			System.out.println("Inserisci codice conto");
			
			conto.setSaldo(Integer.parseInt(s.nextLine()));
			
			System.out.println(conto.getSaldo());
			System.out.println(conto.getNumeroConto());
		
			System.out.println("ciao");
			

			contiduel.add(conto);
			corr.setContidue(contiduel);

			
	
	
	
		return corr;
		
		
	}
	
	public Correntista nuovoConto(ArrayList<Correntista> correntisti)
	{
		String cfRicerca;
		

		
		
		
		System.out.println("Hai deciso di fare una ricerca tramite cf, inserisci il cf");
		cfRicerca = s.nextLine();
		for(int i=0;i<grandezza;i++)
		{
			
			if(cfRicerca.equals(correntisti.get(i).getCf()))
			{	
				
				Conto conto = new Conto();
				
				System.out.println("Mi ha trovato il codice fiscale");
				System.out.println(cfRicerca);
				System.out.println(correntisti.get(i).getNome());
				
				System.out.println("Inserisci nuovo conto");
				conto.setNumeroConto(s.nextLine());
				
				conto.setSaldo(Double.parseDouble(s.nextLine()));
				
				correntisti.get(i).contidue.add(conto);
				
				
				
				
				
				
			}
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
		

		
	}
	public Correntista ricercaModifica(ArrayList<Correntista> correntisti)
	{	
		int scelta =0;
		String nomeMod = null;
		String cognomeMod = null;
		System.out.println("Inserisci CF");
		String cfRicerca = s.nextLine();
		
		for(int i=0;i<grandezza;i++)
		{
			
			if(cfRicerca.equals(correntisti.get(i).getCf()))
			{
				System.out.println("Mi ha trovato il codice fiscale");
				System.out.println(cfRicerca);
				System.out.println(correntisti.get(i).getNome());
				

					System.out.println("Modifica nome");
					nomeMod = s.nextLine();
					System.out.println("Modifica cognome");
					cognomeMod = s.nextLine();
					
					
					correntisti.get(i).nome = nomeMod;
					correntisti.get(i).cognome = cognomeMod;
					
				
				
				}
			}
		
		return null;
	
		
		
		
		
	}
	
	
	
	public Correntista ordinamento(ArrayList<Correntista> correntisti) {
	
		
		
		
		correntisti.sort((primocognome, secondocognome) -> primocognome.getCognome().compareTo(secondocognome.getCognome()));

		for (Correntista cognomi : correntisti) {
            System.out.println(cognomi.getCognome());
        }
		
		return null;
		

	}

	
	
	
	public Correntista versamento(ArrayList<Correntista> correntisti) {
		
		String cfRicerca;
		String contoRicerca;
		int scelta;
		double versamento;
		
		System.out.println("Premi 1 per fare una ricerca tramite CF");
		System.out.println("Premi 2 per fare una ricerca tramite conto");
		scelta = Integer.parseInt(s.nextLine());
		
		
		switch (scelta) {
		
		case 1 :
			int posizione;
			System.out.println("Hai deciso di fare una ricerca tramite cf, inserisci il cf");
			cfRicerca = s.nextLine();
			for(int i=0;i<grandezza;i++)
			{
				
				if(cfRicerca.equals(correntisti.get(i).getCf()))
				{
					System.out.println("Mi ha trovato il codice fiscale");
					System.out.println(cfRicerca);
					
					System.out.println(correntisti.get(i).getNome());

					System.out.println("A quale conto vuoi versare?Inserisci il numero");
					contoRicerca = s.nextLine();
					
					posizione = i;
					
					for(int j=0;j<correntisti.get(i).contidue.size();j++)
					{
						
				
						if(contoRicerca.equals(correntisti.get(i).contidue.get(j).numeroConto))
						{	
							System.out.println("hai trovato il conto,inserisci il nuovo saldo");
							System.out.println(correntisti.get(i).contidue.get(j).numeroConto);
							
							versamento = Double.parseDouble(s.nextLine());
							
							
							versamento = correntisti.get(i).contidue.get(j).saldo + versamento;
							
							correntisti.get(i).contidue.get(j).setSaldo(versamento);
							System.out.println("versamento effettuato");
							
						}
						
						
						
					}
						
				}
				
			
			}
			
			
			
			
			break;
			
		case 2:
			
			System.out.println("Hai deciso di fare una ricerca tramite conto, inserisci il conto");
			contoRicerca = s.nextLine();
		

			for(int i=0;i<correntisti.size();i++)
			{	
				System.out.println("ciao");
				
				for(int j=0;j<correntisti.get(i).contidue.size();j++)
				{
				
					if(contoRicerca.equals(correntisti.get(i).contidue.get(j).getNumeroConto()))
					{
					
					System.out.println("Mi ha trovato il conto ");
			
					System.out.println(correntisti.get(i).contidue.get(j).numeroConto);
	
				//	System.out.println("ecco conto");
				//	System.out.println(correntisti.get(i).contidue.get(i).numeroConto);
		
					
					
							versamento = Double.parseDouble(s.nextLine());
							
							
							versamento = correntisti.get(i).contidue.get(j).saldo + versamento;
							
							correntisti.get(i).contidue.get(j).setSaldo(versamento);
							System.out.println("versamento effettuato");
							
						
						
						
				}	
					
						
				}
				
			
			}
			
			break;
		
		
		
		
		
		}
		
		
		
		
		return null;
		
		
		
	}
	
public Correntista prelievo(ArrayList<Correntista> correntisti) {
		
		String cfRicerca;
		String contoRicerca;
		int scelta;
		double versamento;
		
		System.out.println("Premi 1 per fare una ricerca tramite CF");
		System.out.println("Premi 2 per fare una ricerca tramite conto");
		scelta = Integer.parseInt(s.nextLine());
		
		
		switch (scelta) {
		
		case 1 :
			int posizione;
			System.out.println("Hai deciso di fare una ricerca tramite cf, inserisci il cf");
			cfRicerca = s.nextLine();
			for(int i=0;i<grandezza;i++)
			{
				
				if(cfRicerca.equals(correntisti.get(i).getCf()))
				{
					System.out.println("Mi ha trovato il codice fiscale");
					System.out.println(cfRicerca);
					
					System.out.println(correntisti.get(i).getNome());

					System.out.println("A quale conto vuoi versare?Inserisci il numero");
					contoRicerca = s.nextLine();
					
					posizione = i;
					
					for(int j=0;j<correntisti.get(i).contidue.size();j++)
					{
						
				
						if(contoRicerca.equals(correntisti.get(i).contidue.get(j).numeroConto))
						{	
							System.out.println("hai trovato il conto,inserisci il nuovo saldo");
							System.out.println(correntisti.get(i).contidue.get(j).numeroConto);
							
							versamento = Double.parseDouble(s.nextLine());
							
							
							versamento = correntisti.get(i).contidue.get(j).saldo - versamento;
							
							correntisti.get(i).contidue.get(j).setSaldo(versamento);
							System.out.println("versamento effettuato");
							
						}
						
						
						
					}
						
				}
				
			
			}
			
			
			
			
			break;
			
		case 2:
			
			System.out.println("Hai deciso di fare una ricerca tramite conto, inserisci il conto");
			contoRicerca = s.nextLine();
		

			for(int i=0;i<correntisti.size();i++)
			{	
				System.out.println("ciao");
				
				for(int j=0;j<correntisti.get(i).contidue.size();j++)
				{
				
					if(contoRicerca.equals(correntisti.get(i).contidue.get(j).getNumeroConto()))
					{
					
					System.out.println("Mi ha trovato il conto ");
			
					System.out.println(correntisti.get(i).contidue.get(j).numeroConto);
	
				//	System.out.println("ecco conto");
				//	System.out.println(correntisti.get(i).contidue.get(i).numeroConto);
		
					
					
							versamento = Double.parseDouble(s.nextLine());
							
							
							versamento = correntisti.get(i).contidue.get(j).saldo - versamento;
							
							correntisti.get(i).contidue.get(j).setSaldo(versamento);
							System.out.println("versamento effettuato");
							
						
						
						
				}	
					
						
				}
				
			
			}
			
			break;
		
		
		
		
		
		}
		
		
		
		
		return null;
		
		
		
	}
	
}
