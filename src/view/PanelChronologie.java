package view;

import java.io.File;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Evenement;
import model.Chronologie;
import model.Date;

public class PanelChronologie extends JPanel implements ActionListener {
	Chronologie maFrise = new Chronologie ("Frise de test", 1990, 2025, 10, "revolution");

	//Evenement evt1 = new Evenement (new Date(14,07,1789), "Revolution", "prise de la bastille et emeute dans les rue", 1, "image/image_evt.png"); //+File.separator+"image_evt.png");
	Evenement evt0 = new Evenement (new Date(11,9,2001), "Attentats", "Le jour ou tout a basculé", 4, "twintower.png");
	Evenement evt2 = new Evenement (new Date(22,7,1991), "Creation de l'UVSQ", "L’acte de naissance officiel de l’université de Versailles Saint-Quentin-en-Yvelines est signé aux services centraux rue du refuge.", 4, "signature.png");
	Evenement evt3 = new Evenement (new Date(13,6,1992), "Inauguration du batiment Leclerc", "Michel Garnier coupe le ruban du bâtiment destiné à la faculté de droit et de science politique à Guyaucourt.", 2, "inauguration.png");
	Evenement evt4 = new Evenement (new Date(28,9,2016), "Inauguration de la MDE à Guyancourt", "Un evenement très attendu à l'UVSQ.", 2, "MDE.png");

	CardLayout gestCard = new CardLayout(25,25);

	PanelFrise pFrise = new PanelFrise();
	PanelEvenement pEvt = new PanelEvenement();
	//PanelAffichage pAffichage = new PanelAffichage();
	
	public PanelChronologie () {
		maFrise.ajout(evt0);
		//maFrise.ajout(evt1);
		maFrise.ajout(evt2);
		maFrise.ajout(evt3);
		maFrise.ajout(evt4);		
		setLayout(gestCard);

		PanelFrise panelFri = new PanelFrise();
		add(panelFri,"Frise");
		PanelEvenement panelEvt = new PanelEvenement();
		add(panelEvt,"Evenement");
		PanelAffichage afficheEvt = new PanelAffichage(evt0,maFrise);
		add(afficheEvt,"Affichage");
	
	//Controleur controleur = new Controleur(monAgenda,panelFormulaire,panelCalendrier,panelAffichage);
	}
	
	public void actionPerformed (ActionEvent evt) {
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
		gestCard.show(this, evt.getActionCommand());		
	}
}