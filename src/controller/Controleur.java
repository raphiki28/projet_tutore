package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Chronologie;
import model.Date;
import view.PanelAffichageEvenement;
import view.PanelAffichageFrise;
import view.PanelFormulaireEvenement;
import view.PanelFormulaireFrise;

public class Controleur implements ActionListener {
	Chronologie frise;
	PanelFormulaireEvenement panelFormulaireEvt;
	PanelFormulaireFrise panelFormulaireFrise;
	PanelAffichageEvenement panelAffichageEvt;
	PanelAffichageFrise panelAffichageFrise;
	
	public Controleur(Chronologie parFrise, PanelFormulaireEvenement parPanelFormulaireEvt,PanelFormulaireFrise parPanelFormulaireFrise,PanelAffichageEvenement parPanelAffichageEvenement, PanelAffichageFrise parPanelAffichageFrise) {
	frise = parFrise;
	panelFormulaireEvt =parPanelFormulaireEvt;
	panelFormulaireFrise=parPanelFormulaireFrise;
	panelAffichageEvt=parPanelAffichageEvenement;
	panelAffichageFrise = parPanelAffichageFrise;
	panelFormulaireEvt.enregistreEcouteur(this);
	panelFormulaireFrise.enregistreEcouteur(this);
	//panelAffichageFrise.enregisterEcouteur(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getActionCommand().equals("Ajouter")){
			frise.ajout(panelFormulaireEvt.getEvenement());			
		}
		else if(evt.getActionCommand().equals("Créer")) {
			Chronologie frise2 = panelFormulaireFrise.getFrise();
		}
		else if (evt.getActionCommand().equals(">")){
		//	show.
		}
	}
}
