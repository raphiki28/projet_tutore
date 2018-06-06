package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TreeSet;

public class Chronologie {
	private String nom;
	private TreeSet <Evenement> chronoEvts;
	private Date debut;
	private Date fin;
	private int periode;
	private String lienFichier;
	
	public Chronologie (String parNom, Date parDebut, Date parFin, int parPeriode, String parFile) {
		nom = parNom;
		
		chronoEvts = new TreeSet <> ();
		debut = parDebut;
		fin = parFin;
		periode = parPeriode;
		lienFichier = parFile;
	}
	
	public void ajout (Evenement parEvt) {
		chronoEvts.add(parEvt);
	}
	
	public void suppression (Evenement parEvt) {
		chronoEvts.remove(parEvt);
	}
	public Collection<Evenement> getEvenement() {
		return chronoEvts;
	}
}
/*	
	public String toString2 () {
		String chaine = new String();
		for (Evenement evt : chronoEvts.get(i))
			chaine += ">>> " + evt.getDate().toString() + "\n\t" + evt.getTitre() + " à " + evt.getLieu() + "\n";

		for (int i=0 ; i<52 ; i++)
			if (mapEvts.containsKey(i)) {
				chaine += "Semaine " + i + " :\n";
				for (Evenement evt : mapEvts.get(i))
					chaine += ">>> " + evt.getDate().toString() + "\n\t" + evt.getTitre() + " à " + evt.getLieu() + "\n";
			}
		return chaine;
	}
	
	public void ajout(Evenement parEvt) {
		chronoEvt.add(parEvt);
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
	
	public String toString (){
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
*/

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
