package model;

import java.util.HashMap;
import java.util.TreeSet;

import modele.Evenement;

public class Chronologie {
	private HashMap <Integer, TreeSet <Evenement>> chronoEvts;
	private String nomChrono;
	private int anneeDebut;
	private int anneeFin;
	private int periode;
	private String lienFichier;
	
	public Chronologie (String parNom, int parDebut, int parFin, int parPeriode, String parFichier) {
		chronoEvts = new HashMap <> ();
		nomChrono = parNom;
		anneeDebut = parDebut;
		anneeFin = parFin;
		periode = parPeriode;
		lienFichier = parFichier;
	}
	
	public void ajout (Evenement parEvt) {
		int annee = parEvt.getDate().getAnnee();
		if (chronoEvts.containsKey(annee))
			chronoEvts.get(annee).add(parEvt);
		else {
			TreeSet <Evenement> set = new TreeSet <Evenement> () ;
			set.add(parEvt);
			chronoEvts.put(annee, set);
		}
	}
	
	public TreeSet<Evenement> getEvtParAnnee (int parAnnee) {
		return chronoEvts.get(parAnnee);
	}
	
	public int nbEvtParAnnee (int parAnnee) {
		return chronoEvts.get(parAnnee).size();
	}
	
	public int nbEvtTotal () {
		int nbEvt = 0;
		for (Integer annee : chronoEvts.keySet())
			nbEvt += chronoEvts.get(annee).size();
		return nbEvt;
	}
	
	public String toString() {
		String chaine = nomChrono + "\n";
		for (int i=anneeDebut ; i<anneeFin ; i++)
			if (chronoEvts.containsKey(i)) {
				chaine += "- " + i + " :\n";
				for (Evenement evt : chronoEvts.get(i))
					chaine += "\t>>> " + evt.getDate() + "\t [" + evt.getPoids() + "] " + evt.getTitre() + "\n";
			}
		return chaine;
	}
	
    public HashMap <Integer, TreeSet<Evenement>> getChronologie() {
        return chronoEvts;
    }
	
	public String getNom () {
		return nomChrono;
	}
	
	public int getAnneeDebut () {
		return anneeDebut;
	}
	
	public int getAnneeFin () {
		return anneeFin;
	}
	
	public int getPeriode () {
		return periode;
	}
	
	public String getLienFichier () {
		return lienFichier;
	}
	
	public void setAnneeDebut (int parDebut) {
		anneeDebut = parDebut;
	}
	
	public void setAnneeFin (int parFin) {
		anneeFin = parFin;
	}
	
	public void setPeriode (int parPeriode) {
		periode = parPeriode;
	}
	
	public void setLienFichier (String parFichier) {
		lienFichier = parFichier;
	}
}