package model;

import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

import modele.Evenement;

public class Frise extends DefaultTableModel {
	static final int nbPoids = 4;

	public Frise (Chronologie frise, int parAnnee) {
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
        
		public int nbEvtTotal () {
			int nbEvt = 0;

				
			return nbEvt;
		}
		
		for (Integer annee : chronoEvts.keySet()) {
			nbEvt += chronoEvts.get(annee).size();
		}
		
        TreeSet <Evenement> arbreEvts = frise.getEvtParAnnee(parAnnee);
        if (arbreEvts != null)
            for (Evenement evt : arbreEvts)
                placeEvt(evt);
	}
	
	public void placeEvt (Evenement parEvt) {
		int indiceLigne = 0;
		int indiceColonne = 0;
		parEvt.
		setValueAt(parEvt, indiceLigne, indiceColonne);
	}
	
    public boolean isCellEditable (int indiceLig, int indiceCol) {
        return false;
    }
}