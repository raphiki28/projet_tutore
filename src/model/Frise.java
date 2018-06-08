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
			if (intitule%frise.getPeriode()==0 || i==0 || i==longueurFrise)
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
	                placeEvt(frise, evt);
		}
	}
	
	public void placeEvt (Chronologie parChrono, Evenement parEvt) {
		int indiceLigne = parEvt.getPoids()-1;
		int indiceColonne = parEvt.getDate().getAnnee() - parChrono.getAnneeDebut();
		System.out.println(indiceLigne);
		System.out.println(indiceColonne);
		setValueAt(parEvt, indiceLigne, indiceColonne);
	}
	
    public boolean isCellEditable (int indiceLig, int indiceCol) {
        return false;
    }
}