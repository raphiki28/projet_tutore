package view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controleur;
import model.Chronologie;

public class PanelChronologie extends JPanel implements ActionListener {
	Chronologie maFriseChronologique = new Chronologie ("Histoire de l'UVSQ", 1985, 2025, 10, "dossier");
	CardLayout gestCard = new CardLayout(25,25);

	public PanelChronologie () {
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