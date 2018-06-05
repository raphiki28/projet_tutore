package view;

import javax.swing.*;

import controller.Controleur;
import model.Evenement;
import model.Chronologie;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Date;
public class PanelChronologie extends JPanel implements ActionListener {
	
		private static final long serialVersionUID = 1L;
		CardLayout gestionnaireCard = new CardLayout(25,25);
		public PanelChronologie (){
				Chronologie maFrise = new Chronologie(10);
				Evenement evt1 =new Evenement(new Date(14,07,1789),"Revolution","prise de la bastille et emeute dans les rue",1,"image"+File.separator+"image_evt.png");
				
				this.setLayout(gestionnaireCard);		
				
				PanelEvenement panelEvt = new PanelEvenement(maFrise);
				add(panelEvt,"Evenement");
				PanelFrise panelFri = new PanelFrise();
				add(panelFri,"Frise");
				PanelAffichage afficheEvt = new PanelAffichage(evt1,maFrise);
				add(afficheEvt,"Affichage");
					
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