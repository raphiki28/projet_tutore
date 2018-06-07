package model;

import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

public class Frise extends DefaultTableModel {
	static final int nbPoids = 4;

	public Frise (Chronologie frise) {
		int longueurFrise = frise.getAnneeFin() - frise.getAnneeDebut();
		
		String [] tabIntitules = new String [longueurFrise];
		for (int i=0 ; i<longueurFrise ; i++) {
			int intitule = frise.getAnneeDebut()+i;
			if (intitule%frise.getPeriode()==0)
				tabIntitules[i] = String.valueOf(intitule);
			else
				tabIntitules[i] = "";
		}
        setColumnCount(longueurFrise);
        setRowCount(nbPoids);
        setColumnIdentifiers(tabIntitules);
        
		for (Integer annee : frise.getChronologie().keySet()) {
			TreeSet <Evenement> arbreEvts = frise.getEvtParAnnee(annee);
	        if (arbreEvts != null)
	            for (Evenement evt : arbreEvts)
	                placeEvt(evt);
		}
	}
	
	public void placeEvt (Evenement parEvt) {
		int indiceLigne = parEvt.getPoids();
		int indiceColonne = parEvt.getDate().getAnnee()-1990;
		setValueAt(parEvt, indiceLigne, indiceColonne);
	}
	
    public boolean isCellEditable (int indiceLig, int indiceCol) {
        return false;
    }
}