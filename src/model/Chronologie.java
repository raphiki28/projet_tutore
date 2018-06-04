package model;
import java.util.*;

import model.Evenement;


public class Frise {
	private final int LONGEUR;
	private Evenement [] tabEvenement;
	private int nbEvenements = 0;
	HashMap <Integer, ArrayList<Evenement> > Hash_evt; 
	GregorianCalendar calendar;
	public Frise(int parLONGEUR){
		
		Hash_evt = new HashMap <Integer, ArrayList<Evenement> >();
		LONGEUR = parLONGEUR;
		this.tabEvenement = new Evenement[LONGEUR];
	}
	
	public void ajout(Evenement parEvt){
		tabEvenement[nbEvenements] = parEvt;
		nbEvenements ++;
		
		Date date = parEvt.getChDate();
		calendar = new GregorianCalendar(date.getAnnee(), date.getMois()-1, date.getJour());
		int numeroDeSemaine = calendar.get(Calendar.WEEK_OF_YEAR);
		if (Hash_evt.containsKey(numeroDeSemaine)){
			Hash_evt.get(numeroDeSemaine).add(parEvt);
		}
		else{
			ArrayList <Evenement> liste = new ArrayList();
			liste.add(parEvt);
			Hash_evt.put(numeroDeSemaine, liste);
		}
		
		
		
	}
	
	public String toString(){
		String chaine = new String();
		for(int i=0;i<nbEvenements;i++){
			chaine+=tabEvenement[i]+"\n";
		}
		return chaine;
	}

	public Collection<Evenement> getEvenementSemaine(int numSemaine) {
		return Hash_evt.get(numSemaine);
	}
	public Collection<Evenement> getEvenementSemaine(Date date) {
		GregorianCalendar calendar = new GregorianCalendar(date.getAnnee(),date.getMois()-1,date.getJour());
		int numSemaine = calendar.get(Calendar.WEEK_OF_YEAR);
		return Hash_evt.get(numSemaine);
	}

}


/*
public class Agenda {
	private ArrayList <Evenement> listEvts;
	private TreeSet <Evenement> arbreEvts;
	
	public Agenda(){
		listEvts = new ArrayList <Evenement>();
		arbreEvts = new TreeSet <Evenement>();
	}
	
	public void ajout(Evenement parEvt){
		listEvts.add(parEvt);
		arbreEvts.add(parEvt);
	}
	
	public int comptNbEvt(String parString){
		int compteur=0;
		return compteur;
	}
	
	//ne marche pas car le comareTo n est pas fait
	/*public int getEvenement(Evenement parEvt){
		boolean trouve = false;
		int indice = 0;
		while(!trouve && indice < nbEvenements){
			if(tabEvenement[indice].compareTo(parEvt)==0){
				trouve = true;
			}
			else{
				indice ++;
			}
		}
		if(trouve){
			return indice;
		}
		return -1;
	}
	
	public String toString(){
		String chaine = new String();
		for(int i=0;i<nbEvenements;i++){
			chaine+=tabEvenement[i]+"\n";
		}
		return chaine;
	}*/
//}
