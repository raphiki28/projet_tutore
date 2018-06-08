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
		maFriseChronologique.ajout(new Evenement (new Date(01,9,1985), "Implantation d'une antenne à St-Quentin", "Tout commence lorsqu'antenne délocalisée de Nanterre Paris-X s’installe à Guyancourt dans un groupe scolaire désaffecté", 2, "truc"));
		maFriseChronologique.ajout(new Evenement (new Date(22,7,1991), "Creation de l'UVSQ", "L’acte de naissance officiel de l’université de Versailles Saint-Quentin-en-Yvelines est signé aux services centraux rue du refuge.", 4, "signature.png"));
		maFriseChronologique.ajout(new Evenement (new Date(13,6,1992), "Inauguration du batiment Leclerc", "Michel Garnier coupe le ruban du bâtiment destiné à la faculté de droit et de science politique à Guyaucourt.", 2, "inauguration.png"));
		maFriseChronologique.ajout(new Evenement (new Date(28,9,2016), "Inauguration de la MDE à Guyancourt", "Un evenement très attendu à l'UVSQ.", 2, "MDE.png"));

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