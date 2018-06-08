package view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controleur;
import model.Chronologie;
import model.Date;
import model.Evenement;

public class PanelChronologie extends JPanel implements ActionListener {
	Chronologie maFriseChronologique = new Chronologie ("Histoire de l'UVSQ", 1985, 2025, 10, "dossier");
	CardLayout gestCard = new CardLayout(25,25);

	public PanelChronologie () {
		maFriseChronologique.ajout(new Evenement (new Date(01,9,1985), "Implantation d'une antenne � St-Quentin", "Tout commence lorsqu'antenne d�localis�e de Nanterre Paris-X s�installe � Guyancourt dans un groupe scolaire d�saffect�", 2, "truc"));
		maFriseChronologique.ajout(new Evenement (new Date(22,7,1991), "Creation de l'UVSQ", "L�acte de naissance officiel de l�universit� de Versailles Saint-Quentin-en-Yvelines est sign� aux services centraux rue du refuge.", 4, "signature.png"));
		maFriseChronologique.ajout(new Evenement (new Date(13,6,1992), "Inauguration du batiment Leclerc", "Michel Garnier coupe le ruban du b�timent destin� � la facult� de droit et de science politique � Guyaucourt.", 2, "inauguration.png"));
		maFriseChronologique.ajout(new Evenement (new Date(28,9,2016), "Inauguration de la MDE � Guyancourt", "Un evenement tr�s attendu � l'UVSQ.", 2, "MDE.png"));

		PanelFrise pFrise = new PanelFrise();
		PanelEvenement pEvt = new PanelEvenement();
		PanelAffichage pAffichage = new PanelAffichage(maFriseChronologique);
		setLayout(gestCard);
		add(pFrise,"Frise");
		add(pEvt,"Evenement");
		add(pAffichage,"Affichage");
		//Controleur controleur = new Controleur(maFriseChronologique,pFrise,pEvt,pAffichage);
	}
	
	public void actionPerformed (ActionEvent evt) {
		gestCard.show(this, evt.getActionCommand());
		if (evt.getActionCommand() == "Quitter") {
			int saisi = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter l'application ?","Comfirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
			switch (saisi) {
			case JOptionPane.CLOSED_OPTION:
				break;
			case JOptionPane.OK_OPTION:
				System.exit(0);
			case JOptionPane.CANCEL_OPTION:
				break;
			}
		}
	}
}