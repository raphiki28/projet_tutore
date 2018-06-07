package model;

import javax.swing.table.DefaultTableModel;

public class Frise extends DefaultTableModel {
	static final int nbPoids = 4;

	public Frise (Chronologie maFrise) {
		int longueurFrise = maFrise.getAnneeFin() - maFrise.getAnneeDebut();
		
		String [] tabIntitules = new String [longueurFrise];
		for (int i=0 ; i<longueurFrise ; i++) {
			int intitule = maFrise.getAnneeDebut()+i;
			if (intitule%maFrise.getPeriode()==0)
				tabIntitules[i] = String.valueOf(intitule);
			else
				tabIntitules[i] = "";
		}
        setColumnCount(longueurFrise);
        setRowCount(nbPoids);
        setColumnIdentifiers(tabIntitules);
	}
}