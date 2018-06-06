package model;
import java.util.StringTokenizer;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	
	public Date (int parJour, int parMois, int parAnnee) {
		annee = parAnnee;
		mois = parMois;
		jour = parJour;
	}
	
	public Date(int parAnnee) {
		annee = parAnnee;
		mois = 1;
		jour = 1;
	}
	
	public String toString () {
		String [] nomMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "novembre", "octobre", "décembre"};
		return jour + " " + nomMois[mois-1] + " " + annee;
	}
	
	public String toString2 () {
		return jour + "/" + mois + "/" + annee;
	}
	
	public int compareTo (Date parDate) {
		if (annee < parDate.annee)
			return -1;
		if (annee > parDate.annee)
			return 1;
		if (mois < parDate.mois)
			return -1;
		if (mois > parDate.mois)
			return 1;
		if (jour < parDate.jour)
			return -1;
		if (jour > parDate.jour)
			return 1;
		return 0;
	}
	
	public static Date lireDate () {
		System.out.println("Entrer le jour");
		int parJour = Clavier.lireInt();
		System.out.println("Entrer le mois");
		int parMois = Clavier.lireInt();
		System.out.println("Entrer l'année");
		int parAnnee = Clavier.lireInt();
		return new Date(parJour, parMois, parAnnee);
	}
	
	public static Date lireDate2 () {
		System.out.println("Entrer la date sous la forme 'dd-mm-aaaa'");
		String chaine = Clavier.lireString();
		StringTokenizer souschaine = new StringTokenizer(chaine, "-");
		int [] valeurs = new int[3];
		for (int i=0 ; souschaine.hasMoreTokens() ; i++)
			valeurs[i] = Integer.parseInt(souschaine.nextToken());
		return new Date(valeurs[0], valeurs[1], valeurs[2]);
	}

	public static boolean estBissextile (int parAnnee) {
		return(parAnnee%4==0 && parAnnee%100!=0) || parAnnee%400==0;
	}
	
	public static int dernierJourDuMois (int parMois, int parAnnee) {
		switch (parMois) {
			case 2:
				if (estBissextile(parAnnee))
					return 29;
				return 28;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			default:
				return 30;
		}
	}
	
	public boolean estValide () {
		if (annee<1583)
			return false;
		if (mois>0 && mois<=12 && jour>0 && jour<=dernierJourDuMois(mois, annee))
			return true;
		return false;
	}

	public int getJour () {
		return jour;
	}
	
	public int getMois () {
		return mois;
	}
	
	public int getAnnee () {
		return annee;
	}
	
	public String getNomMois () {
		String [] nomMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "novembre", "octobre", "décembre"};
		return nomMois[mois-1];
	}
}