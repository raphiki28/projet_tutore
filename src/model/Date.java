package model;

import java.util.GregorianCalendar;
import java.util.Calendar;
 
public class Date {
  private int chJour;
  private int chMois;
  private int chAnnee;
   
  public Date ()   { 
	  GregorianCalendar dateAuj = new GregorianCalendar ();
	  chAnnee = dateAuj.get (Calendar.YEAR);
	  chMois = dateAuj.get (Calendar.MONTH)+1; // janvier = 0, fevrier = 1...
	  chJour = dateAuj.get (Calendar.DAY_OF_MONTH);
  }
  
  public Date (int parJour, int parMois, int parAnnee)   {   
	  chJour = parJour;
	  chMois = parMois;
	  chAnnee = parAnnee; 
	GregorianCalendar date = new GregorianCalendar (chAnnee,chMois-1,chJour);
  } 
   
  /**
   * retourne 0 si this et parDate sont egales, 
   * -1 si this procede parDate,
   *  1 si parDate procede this
   */
  public int compareTo (Date parDate) {
    if (chAnnee < parDate.chAnnee)
		return -1;
	if (chAnnee > parDate.chAnnee)
		return 1;
	// les annees sont =
	if (chMois < parDate.chMois)
		return -1;
	if (chMois > parDate.chMois)
		return 1;
	// les mois sont =
	if (chJour < parDate.chJour)
		return -1;
	if (chJour > parDate.chJour)
		return 1;
	return 0;	
  }

  public static int dernierJourDuMois (int parMois, int parAnnee) {
		switch (parMois) {
			 case 2 : if (estBissextile (parAnnee))  return 29 ; else return 28 ;  
			 case 4 : 	 case 6 : 	 case 9 : 	 case 11 : return 30 ;
			 default : return 31 ;
			}  // switch
	  } 
	  
  private static boolean estBissextile(int parAnnee) {
			return parAnnee % 4 == 0 && (parAnnee % 100 != 0 || parAnnee % 400 == 0);
	  }
    
  public String toString () {
    String chaine = new String();
	chaine += " " + chJour + " ";
	switch (chMois) {
		 case 1: chaine += "janvier"; break;
		 case 2: chaine += "fevrier"; break;
		 case 3: chaine += "mars"; break;
		 case 4: chaine += "avril"; break;
		 case 5: chaine += "mai"; break;
		 case 6: chaine += "juin"; break;
		 case 7: chaine += "juillet"; break;
		 case 8: chaine += "aout"; break;
		 case 9: chaine += "septembre"; break;
		 case 10: chaine += "octobre"; break;
		 case 11: chaine += "novembre"; break;
		 case 12: chaine += "decembre"; break;
		}	
	return chaine;
  }  


public int getAnnee() { 
	return chAnnee;
}

public int getJour() { 
	return chJour;
}

public int getMois() { 
	return chMois;
}


public static String getMoisString(int chMois)
	{
	String mois[] = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"} ;
	return mois[chMois - 1] ;
	}


public boolean isToday() {
	return new Date().compareTo(this) == 0;
}
}  // class Date
