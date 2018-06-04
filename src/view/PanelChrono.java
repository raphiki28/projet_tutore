package view;

import javax.swing.*;
import controller.Controleur;
import model.Evenement;
import model.Frise;
import model.Clavier;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Date;
public class PanelChrono extends JPanel implements ActionListener {
	
		private static final long serialVersionUID = 1L;
		CardLayout gestionnaireCard = new CardLayout(25,25);
		public PanelChrono (){
				Frise maFrise = new Frise(10);
				
				this.setLayout(gestionnaireCard);		
				
				PanelFormulaire panelFormulaire = new PanelFormulaire();
				add(panelFormulaire,"Formulaire");
					
				//Controleur controleur = new Controleur(monAgenda,panelFormulaire,panelCalendrier,panelAffichage);
			}		
		public void actionPerformed(ActionEvent evt) {
			if(evt.getActionCommand()=="Fermer"){
				int saisi = JOptionPane.showConfirmDialog(this, "Quittez,","Comfirmation",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				switch(saisi){
				case JOptionPane.CLOSED_OPTION:
					break;
				case JOptionPane.OK_OPTION:
					System.exit(0);
				case JOptionPane.CANCEL_OPTION:
					break;
				}
			}
			gestionnaireCard.show(this, evt.getActionCommand());		
		}
	}